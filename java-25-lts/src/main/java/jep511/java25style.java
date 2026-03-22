package jep511;

// ════════════════════════════════════════════════════════
// ✅ NEW STYLE — Java 25 JEP 511 (one line for entire module)
// ════════════════════════════════════════════════════════
import module java.base;   // ← replaces ALL imports above

public class java25style {
    public void execute() {
        List<String> names     = List.of("Alice", "Bob");
        Map<String, Integer> m = Map.of("Alice", 95);
        Set<String> set        = Set.of("A", "B");
        Optional<String> opt   = Optional.of("Java");
        Path path              = Path.of("/app");
        Stream<String> stream  = names.stream();
    }
}
