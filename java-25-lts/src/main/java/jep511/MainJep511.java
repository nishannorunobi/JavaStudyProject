package jep511;

// ✅ JEP 511 — Single line imports the ENTIRE java.base module
// Gives access to: List, Map, Set, Path, Stream, Optional, etc.
import module java.base;

/**
 * JEP 511 — Module Import Declarations
 * ✅ Import all exported packages from a module in ONE line
 */
public class MainJep511 {

    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════");
        System.out.println("  JEP 511 — Module Import Declarations");
        System.out.println("═══════════════════════════════════════");

        // ── Test 1: List — from java.util (inside java.base) ──
        System.out.println("\n  [1] List — java.util.List:");
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.forEach(n -> System.out.println("      → " + n));
        System.out.println("      ✅ No 'import java.util.List' needed");

        // ── Test 2: Map — from java.util ──
        System.out.println("\n  [2] Map — java.util.Map:");
        Map<String, Integer> scores = Map.of("Alice", 95, "Bob", 87);
        scores.forEach((k, v) -> System.out.println("      → " + k + " : " + v));
        System.out.println("      ✅ No 'import java.util.Map' needed");

        // ── Test 3: Optional — from java.util ──
        System.out.println("\n  [3] Optional — java.util.Optional:");
        Optional<String> opt = Optional.of("Java 25");
        System.out.println("      → " + opt.get());
        System.out.println("      ✅ No 'import java.util.Optional' needed");

        // ── Test 4: Path — from java.nio.file ──
        System.out.println("\n  [4] Path — java.nio.file.Path:");
        Path path = Path.of("/app", "java25ltsjar.jar");
        System.out.println("      → " + path);
        System.out.println("      ✅ No 'import java.nio.file.Path' needed");

        // ── Test 5: Stream — from java.util.stream ──
        System.out.println("\n  [5] Stream — java.util.stream.Stream:");
        Stream.of("JEP 511", "JEP 512", "JEP 513")
              .map(s -> "      → " + s)
              .forEach(System.out::println);
        System.out.println("      ✅ No 'import java.util.stream.Stream' needed");

        System.out.println("\n───────────────────────────────────────");
        System.out.println("  ✅ One line: 'import module java.base'");
        System.out.println("  ❌ Old way: one import per class used");
        System.out.println("═══════════════════════════════════════");
    }
}
