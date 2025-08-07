public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String theName) {
        name = theName;
    }

    Animal(){
        System.out.println("Making an animal");
    }
}
