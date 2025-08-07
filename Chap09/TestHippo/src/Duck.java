public class Duck extends Animal{
    int size;
    public Duck (int newSize) {
        super(); // Calls the constructor of the superclass Animal
        size = newSize;
        System.out.println("Making a duck of size " + size);
    }
}
