public class Dog extends Canine implements Pet {
    @Override
    public void makeNoise() {
        System.out.println("Dog barks");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog wags its tail");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating dog food");
    }

    @Override
    public void roam() {
        // TODO Auto-generated method stub
        super.roam();
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        
    }

}
