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

        MyDogList dogList = new MyDogList();
        dogList.addDog(myDog);
        dogList.addDog(new Dog());
        dogList.addDog(new Dog());
        dogList.addDog(new Dog());
        dogList.addDog(new Dog());
        
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        list.add(dog);
        list.add(cat);
    }

    public class MakeCanine {
        public void go() {
            Canine c;
            c = new Dog(); // This is valid since Dog is a Canine
            // c = new Canine(); // This line would cause a compile-time error because Canine is abstract
            c.roam();
        }
    }
    
}
