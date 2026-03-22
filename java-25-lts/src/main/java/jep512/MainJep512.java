package jep512;

/**
 * JEP 512 — Compact Source Files & Instance Main Methods
 * ✅ No public, no static, no String[] args
 */
class MainJep512 {

    // Instance field — directly accessible inside instance main()
    private String message = "Hello from JEP 512 — Instance Main!";

    void main() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("✅ Running "+this.getClass().getName());
        System.out.println("═══════════════════════════════════════");

        // ✅ Access instance field directly — no static context
        System.out.println("  " + message);

        // ✅ Call instance methods directly
        greet("Alice");
        greet("Bob");

        System.out.println("───────────────────────────────────────");
        System.out.println("  ✅ Ran via: void main()");
        System.out.println("  ❌ Old way: public static void main(String[] args)");
        System.out.println("═══════════════════════════════════════");

        System.out.println("═══════════════════════════════════════");
        System.out.println("✅ Done "+this.getClass().getName());
        System.out.println("═══════════════════════════════════════");
    }

    private void greet(String name) {
        System.out.println("  → Hello, " + name + "!");
    }
}