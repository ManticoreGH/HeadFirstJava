import java.util.*;
import java.util.function.*;

public class App {
    public static void main(String[] args) throws Exception {
        Comparator<String> comparator = (s1, s2) -> s1.compareToIgnoreCase(s2);
        Runnable runnable = () -> System.out.println("Hello, World!");
        Consumer<String> consumer = str -> System.out.println(str);
        runnable.run();
        consumer.accept("Hello, World!");

        Runnable r = () -> System.out.println("Hi!");
        r.run();
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hi!");
        // Supplier<String> s = () -> System.out.println("Some string"); // Won't run
        // incompatible type!
        // Consumer<String> c2 = (s1, s2) -> System.out.println(s1 + s2); // Won't run
        // incompatible type!
        // Runnable r2 = (String str) -> System.out.println(str); // Won't run
        // incompatible type!
        Function<String, Integer> f = s -> s.length(); // Will run compatible type!
        System.out.println(f.apply("Hello"));
        Supplier<String> s = () -> "Some string"; // Will run compatible type!
        System.out.println(s.get());
        // Consumer<String> c2 = s -> "String" + s; // Won't run because it expects a Consumer<String>
        // Function<String, Integer> f2 = (int i) -> "i = " + i; // Won't run incompatible type!
        // Supplier<String> s2 = s2 -> "Some string" + s2; // Won't run incompatible type!
        Function<String, Integer> f2 = (String str) -> str.length(); // Will run compatible type!
        System.out.println(f2.apply("Hello"));
    }
}
