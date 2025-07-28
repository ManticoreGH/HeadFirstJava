public class MyDogList{
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void addDog(Dog d) {
        if (nextIndex < dogs.length) {
            this.dogs[nextIndex] = d;
            System.out.println("Dog added at " + nextIndex);
            nextIndex++;
        } 
    }
}