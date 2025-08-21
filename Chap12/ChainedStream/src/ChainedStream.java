import java.util.*;
import java.util.stream.*;

public class ChainedStream {
    public static void main(String[] args) throws Exception {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        /**
         * Chained Stream Operations
         * 1. Sort the strings in a case-insensitive manner
         * 2. Skip the first 2 elements
         * 3. Limit the result to the next 4 elements
         */
        List<String> result = strings.stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .skip(2)
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("Result: " + result);
    }
}
