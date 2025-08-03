public class Cat extends Feline implements Pet {
    @Override
    public void makeNoise() {
        System.out.println("Cat meows");
    }

    @Override
    public void beFriendly() {
        System.out.println("Cat rubs against you");
    }

    @Override
    public void play() {
        System.out.println("Cat plays with yarn");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish");
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
