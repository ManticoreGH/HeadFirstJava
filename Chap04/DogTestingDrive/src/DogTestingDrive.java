public class DogTestingDrive {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog();
        d1.size = 70;
        d1.name = "Rex";
        System.out.print(d1.name + " says: ");
        d1.bark(2);

        Dog d2 = new Dog();
        d2.size = 20;
        d2.name = "Buddy";
        System.out.print(d2.name + " says: ");
        d2.bark(3);

        Dog d3 = new Dog();
        d3.size = 10;
        d3.name = "Tiny";
        System.out.print(d3.name + " says: ");
        d3.bark(1);
    }
}
