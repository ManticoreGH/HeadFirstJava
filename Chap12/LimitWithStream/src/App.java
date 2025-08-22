import java.util.*;
import java.util.stream.*;


public class App {
    public static void main(String[] args) throws Exception {
        List<String> strings = List.of("I", "am", "a", "list", "of", "strings");
        // Stream<String> stream = strings.stream();
        // Stream<String> limit = stream.limit(4);
        // Long result = limit.count();
        // System.out.println("Result = " + result);
        //System.out.println("Limite = " + limit); //Limite = java.util.stream.SliceOps$1@7344699f
        /**
         * compacting the code above in a single statement
         */
        List<String> result = strings.stream()
            .limit(4)
            .collect(Collectors.toList());
        System.out.println("Strings = " + strings);
        System.out.println("Result = " + result);
        
    }
}
