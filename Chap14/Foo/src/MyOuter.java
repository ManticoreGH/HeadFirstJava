
public class MyOuter {
    private int x;
    private MyInner inner = new MyInner();
    public void doStuff(){inner.go();}

    class MyInner {
        public void go() {
            x = 42;
            System.out.println("x is " + x);
        }
    }
}
