public class Foo {
    public static void main(String[] args) throws Exception {
       MyOuter outerObj = new MyOuter();
       MyOuter.MyInner innerObj = outerObj.new MyInner();
       innerObj.go();
    }
}
