
public class Animal {
    String picture;
    String food;
    String hunger;
    String boundaries;
    String location;

    public void makeNoise() {
        // Default implementation, can be overridden by subclasses
        System.out.println("Animal makes a noise");
    }

    public void eat() {
        // Default implementation, can be overridden by subclasses
        System.out.println("Animal is eating");
    }

    public void roam() {
        // Default implementation, can be overridden by subclasses
        System.out.println("Animal is roaming");
    }
    
    public void sleep() {
        // Default implementation, can be overridden by subclasses
        System.out.println("Animal is sleeping");
    }
}
