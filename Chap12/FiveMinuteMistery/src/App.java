import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        List<Coffee> coffees = List.of(
            new Coffee("Cappuccino", 3),
            new Coffee("Americano", 2),
            new Coffee("Espresso", 5),
            new Coffee("Cortado", 4),
            new Coffee("Mocha", 3),
            new Coffee("Flat White", 4),
            new Coffee("Latte", 3),
            new Coffee("Decaf", 1)
        );
        Optional<Integer> afternoonCoffee = coffees.stream()
            .map(Coffee::getStrength)
            .sorted()
            .findFirst();
        if (afternoonCoffee.isPresent()) {
            int coffeeStrength = afternoonCoffee.get();
            Optional<Coffee> coffee = coffees.stream()
                .filter(c -> c.getStrength() == coffeeStrength)
                .findFirst();
            if (coffee.isPresent()) {
                System.out.println("The first afternoon coffee is: " + coffee.get().getName());
            } else {
                System.out.println("No afternoon coffee found.");
            }
        }
    }
    private static class Coffee implements Comparable<Coffee> {
        private final String name;
        private final int strength;

        public Coffee(String name, int strength) {
            this.name = name;
            this.strength = strength;
        }
        
        public String getName() {
            return name;
        }

        public int getStrength() {
            return strength;
        }

        @Override
        public int compareTo(Coffee o) {
            return this.strength - o.strength;
        }
    }
}
