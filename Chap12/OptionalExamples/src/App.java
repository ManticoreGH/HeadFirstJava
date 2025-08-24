import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
        Optional<IceCream> optional = getIceCream("Strawberry");
        IceCream ice = optional.get();
        //Check if the ice cream is present without this test ice.eat() will throw an exception if empty.
        if (optional.isPresent()) {
            ice.eat();
        } else {
            System.out.println("No ice cream for you!");
        }
    }
    
    private static Optional<IceCream> getIceCream(String flavor) {
        if ("Strawberry".equals(flavor)) {
            return Optional.of(new IceCream());
        } else {
            return Optional.empty();
        }
    }

    private static class IceCream {
        void eat() {
            System.out.println("Yum!");
        }
    }
}
