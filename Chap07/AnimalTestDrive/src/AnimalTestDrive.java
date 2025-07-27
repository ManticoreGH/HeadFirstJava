public class AnimalTestDrive {
    public static void main(String[] args) throws Exception {
        Wolf w = new Wolf();
        Dog myDog = new Dog();
        w.makeNoise();
        w.roam();
        w.eat();
        w.sleep();
        Animal[] animals = new Animal[5];
        animals[0] = myDog;
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();
        for (Animal animal : animals) {
            animal.eat();
            animal.roam();
        }
        PetOwner owner = new PetOwner();
        owner.start();
    }
}
