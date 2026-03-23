package jep506;

public class MainJep506 {
    public static void main(String[] args){
        try {
            new OldThreadLocal().execute();
            new NewScopedValues().execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

// ════════════════════════════════════════════════════════
// ❌ OLD STYLE — ThreadLocal (mutable, leaks, side effects)
// ════════════════════════════════════════════════════════
 class OldThreadLocal {

    // Mutable — any thread can change it anytime
    private static final ThreadLocal<String> CURRENT_USER = new ThreadLocal<>();

    public void execute() throws InterruptedException {

        CURRENT_USER.set("Alice");
        System.out.println("User: " + CURRENT_USER.get()); // Alice

        Thread t = new Thread(() -> {
            CURRENT_USER.set("Bob");                        // ❌ mutates shared state
            System.out.println("User: " + CURRENT_USER.get()); // Bob
        });
        t.start();
        t.join();

        // ❌ Must manually clean up — or memory leaks in thread pools
        CURRENT_USER.remove();

        System.out.println("Problems with ThreadLocal:");
        System.out.println("  ❌ Mutable — any code can overwrite it");
        System.out.println("  ❌ Must call .remove() or memory leaks");
        System.out.println("  ❌ Child threads don't inherit values");
        System.out.println("  ❌ Expensive with virtual threads");
    }
}


// ════════════════════════════════════════════════════════
// ✅ NEW STYLE — JEP 506 Scoped Values (immutable, safe)
// ════════════════════════════════════════════════════════
 class NewScopedValues {

    // Immutable — declared once, set per scope, never mutated
    private static final ScopedValue<String> CURRENT_USER = ScopedValue.newInstance();

    public void execute() throws InterruptedException {

        // ✅ Bind value for this scope — immutable inside the block
        ScopedValue.where(CURRENT_USER, "Alice").run(() -> {
            System.out.println("User: " + CURRENT_USER.get()); // Alice

            // ✅ Child thread automatically inherits the scoped value
            Thread t = Thread.ofVirtual().start(() ->
                System.out.println("Child sees: " + CURRENT_USER.get()) // Alice
            );

            try { t.join(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }

            // ✅ Nested scope — overrides for inner block only
            ScopedValue.where(CURRENT_USER, "Bob").run(() ->
                System.out.println("Inner scope: " + CURRENT_USER.get()) // Bob
            );

            // ✅ Outer scope restored automatically — no .remove() needed
            System.out.println("Back to outer: " + CURRENT_USER.get()); // Alice
        });

        // ✅ Out of scope — automatically cleaned up, no leaks
        System.out.println("\nBenefits of Scoped Values:");
        System.out.println("  ✅ Immutable — cannot be mutated once bound");
        System.out.println("  ✅ Auto cleanup — no .remove() needed");
        System.out.println("  ✅ Inherited by child virtual threads");
        System.out.println("  ✅ Lightweight — designed for virtual threads");
    }
}