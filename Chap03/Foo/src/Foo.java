class Horse{
    private double height = 15.2;
    private String breed;
}

class AddThing {
    int a;
    int b = 12;

    public int add() {
        int total = a + b;
        return total;
    }
}

public class Foo {
    public static void main(String[] args) throws Exception {
        int x;
        int z = x + 3; // This will cause a compile-time error since x is not initialized
    }
}
