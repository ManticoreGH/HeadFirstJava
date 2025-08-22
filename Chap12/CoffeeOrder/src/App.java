import java.util.*;
import java.util.stream.*;
public class App {
    public static void main(String[] args) throws Exception {
        List<String> coffees = List.of("Cappuccino", "Americano"
            , "Espresso", "Cortado", "Mocha"
            , "Cappuccino", "Flat White", "Latte");
        List<String> coffeeEndingInO = coffees.stream() // Stream the coffee list
            .filter(s -> s.endsWith("o")) // Filter coffees ending with 'o'
            .distinct() // Get distinct coffee names
            .sorted() // Sort the coffee names
            .collect(Collectors.toList()); // Collect the results into a list
        System.out.println(coffeeEndingInO);
        
    }
}
