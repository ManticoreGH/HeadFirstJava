public class App {
    public static void main(String[] args) throws Exception {
        Dog d = new Dog();
        d.size = 40;
        d.breed = "Labrador";
        d.name = "Buddy";
        d.bark();
        System.out.println("Dog Name: " + d.name);
        System.out.println("Dog Breed: " + d.breed);
        System.out.println("Dog Size: " + d.size + " cm");
        // Additional functionality can be added here
    }
}
