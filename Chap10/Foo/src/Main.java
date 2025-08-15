//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.go();
        // Foo2.go();// This will cause a compilation error because 'x' is not static in Foo2
        Foo3 f3 = new Foo3();
        f3.go(); // This will compile, but 'x' must be initialized in the constructor or at declaration
        Foo4 f4 = new Foo4();
        f4.go(); // This will compile and print the value of 'x' which is 12
        Foo5 f5 = new Foo5();
        f5.go(15); // This will compile and print the value of 'x' which is 15
        Foo6.go(15); // This will compile and print the value of 'x' which is 15
    }
}