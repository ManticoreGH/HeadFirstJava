public class DogTestDrive {
    public static void main(String[] args) throws Exception {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark(3);
        two.bark(2);
        three.bark(1);
    }
}
