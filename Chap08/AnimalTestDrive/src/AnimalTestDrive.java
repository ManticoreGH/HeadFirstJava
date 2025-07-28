

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
        // inerited methods from Object class demonstration
        Dog a = new Dog();
        Cat c = new Cat();

        if (a.equals(c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(c.getClass().getName());
        System.out.println(c.hashCode()); // Think of it like an ID for the object for now
        System.out.println(c.toString()); // Default toString method from Object class        
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
