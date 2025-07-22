class PoorDog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
public class PoorDogTestDrive {
    public static void main(String[] args) throws Exception {
        PoorDog dog = new PoorDog();
        System.out.println("Dog's size: " + dog.getSize());
        System.out.println("Dog's name: " + dog.getName());
    }
}
