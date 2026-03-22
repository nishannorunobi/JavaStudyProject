package jep511;

// ════════════════════════════════════════════════════════
// ❌ OLD STYLE — Before Java 25 (one import per class)
// ════════════════════════════════════════════════════════
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class OldStyle {
    public void execute() {
        List<String> names     = List.of("Alice", "Bob");
        Map<String, Integer> m = Map.of("Alice", 95);
        Set<String> set        = Set.of("A", "B");
        Optional<String> opt   = Optional.of("Java");
        Path path              = Path.of("/app");
        Stream<String> stream  = names.stream();
    }
}
