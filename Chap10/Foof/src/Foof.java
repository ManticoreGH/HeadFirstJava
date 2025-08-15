public class Foof {
    final int size = 3;
    final int whuffie ;
    Foof(){
        whuffie = 42;
    }

    void doStuff(final int x) {
        // You can not modify the value of x
    }

    void doMore(){
        final int z = 7;
        // you can't change the value of z
    }

}
