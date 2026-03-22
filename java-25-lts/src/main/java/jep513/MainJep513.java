package jep513;

/**
 * JEP 513 — Flexible Constructor Bodies
 * ✅ Statements allowed BEFORE super() or this()
 */
public class MainJep513 {

    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════");
        System.out.println("  JEP 513 — Flexible Constructor Bodies");
        System.out.println("═══════════════════════════════════════");

        // ── Test 1: Valid input — name normalized before super() ──
        System.out.println("\n  [1] Valid dog — name normalized before super():");
        Dog dog1 = new Dog("  rEX  ", "Husky", 3);
        System.out.println("      Result → " + dog1);
        System.out.println("      ✅ Trim + capitalize ran BEFORE super()");

        // ── Test 2: Null name — exception fires before super() ──
        System.out.println("\n  [2] Null name — exception before super():");
        try {
            new Dog(null, "Labrador", 2);
        } catch (IllegalArgumentException e) {
            System.out.println("      ✅ Caught before super(): " + e.getMessage());
        }

        // ── Test 3: Negative age — exception fires before super() ──
        System.out.println("\n  [3] Negative age — exception before super():");
        try {
            new Dog("Buddy", "Poodle", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("      ✅ Caught before super(): " + e.getMessage());
        }

        // ── Test 4: this() chaining ──
        System.out.println("\n  [4] Two-arg constructor — this() chaining:");
        Dog dog2 = new Dog("luna", "Beagle");
        System.out.println("      Result → " + dog2 + " (default age=0)");
        System.out.println("      ✅ Pre-this() logic ran, then delegated");

        System.out.println("\n───────────────────────────────────────");
        System.out.println("  ✅ Statements before super() / this() work!");
        System.out.println("  ❌ Old way: super() forced to be first line");
        System.out.println("═══════════════════════════════════════");
    }
}


// ── Base class ──
class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        System.out.println("      [Animal()] name='" + name + "', age=" + age);
        this.name = name;
        this.age  = age;
    }

    public String getName() { return name; }
    public int    getAge()  { return age;  }

    @Override
    public String toString() { return name + " (age " + age + ")"; }
}


// ── Subclass with pre-super logic ──
class Dog extends Animal {

    private final String breed;

    public Dog(String name, String breed, int age) {
        // ✅ JEP 513: validation + transformation BEFORE super()
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative");

        String clean = name.trim();
        clean = Character.toUpperCase(clean.charAt(0)) + clean.substring(1).toLowerCase();

        super(clean, age);    // ← no longer needs to be first!
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        this(name, breed, 0); // ← this() also no longer needs to be first
    }

    public String getBreed() { return breed; }

    @Override
    public String toString() { return getName() + " / " + breed + " (age " + getAge() + ")"; }
}
