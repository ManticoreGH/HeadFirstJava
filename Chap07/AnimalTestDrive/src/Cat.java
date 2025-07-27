public class Cat extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish");
    }
}
