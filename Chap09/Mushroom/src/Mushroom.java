public class Mushroom {
    public Mushroom(int size) {}

    public Mushroom() {}

    public Mushroom(boolean isMagic) {}

    /**
     * The two constructors below have the same args, but in different order.
     * So they are not ambiguous.
     */
    public Mushroom(boolean isMagic, int size) {}

    public Mushroom(int size, boolean isMagic) {}

    public static void main(String[] args) {}
}
