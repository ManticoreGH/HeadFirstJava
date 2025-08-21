import java.util.*;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> strings = List.of("I", "am", "a", "list", "of", "strings");
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        //System.out.println("Limite = " + limit); //Limite = java.util.stream.SliceOps$1@7344699f
        System.out.println("Limite = " + limit.toList());
    }
}
