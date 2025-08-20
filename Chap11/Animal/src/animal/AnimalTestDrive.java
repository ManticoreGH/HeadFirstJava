package animal;
import java.util.*;

public class AnimalTestDrive {
	public static void main(String[] args) {
		List<Animal> animals = List.of(
				new Dog(),
				new Cat(),
				new Dog()
				);
		takeAnimals(animals);
		/*
		 * List<Dog> dogs = List.of( new Dog(), new Dog() );
		 */
		//		takeAnimals(dogs);
		takeAnimals(new ArrayList<Animal>());
//		takeDogs(new ArrayList<Animal>()); // This line is not valid because it's not a List<Dog>	
//		takeAnimals(new ArrayList<Dog>()); // This line is not valid because it's not a List<Animal>
		takeDogs(new ArrayList<>()); // This line is valid because ArrayList<> is a raw type, which can accept any type of object
//		List<Dog> dogs = new ArrayList<>(); // This line is valid because ArrayList<> is a raw type, which can accept any type of object
//		takeDogs(dogs); // This line is not valid because the method expects an ArrayList<Dog>, not a List<Dog>
		takeSomeAnimals(new ArrayList<Dog>());
		takeSomeAnimals(new ArrayList<>());
		takeSomeAnimals(new ArrayList<Animal>());
		List<Animal> animals2 = new ArrayList<>();
		takeSomeAnimals(animals2);
		List<Object> objects = new ArrayList<>();
//		takeObjects(objects);
//		takeObjects(new ArrayList<Dog>());
		takeObjects(new ArrayList<Object>());
	}

	private static void takeDogs(ArrayList<Dog> arrayList) {}

	private static void takeAnimals(List<Animal> animals) {
		for(Animal a : animals) {
			a.eat();
		}
	}
	
	private static void takeSomeAnimals(List<? extends Animal> animals) {}
	
	private static void takeObjects(ArrayList<Object> objects) {}
	
	public void go() {
		List<Dog> dogs = List.of(
				new Dog(),
				new Dog()
				);
		List<? extends Animal> vaccinatedSomething = vaccineAnimals(dogs);
		
	}
	
	public List<? extends Animal> vaccineAnimals(List<? extends Animal> animals) {	
		return animals;
	}
}

