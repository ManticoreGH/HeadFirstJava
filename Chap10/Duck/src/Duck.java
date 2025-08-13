public class Duck {
    private int size;
    public static void main(String[] args) {
        // ERROR: Cannot call instance method getSize() from static method main()
        // Need to create Duck instance first: Duck duck = new Duck();
        System.out.println("Size of duck is " + getSize());
    }
    public void setSize(int s) {
        size = s;
    }
    public int getSize() {
        return size;
    }
}