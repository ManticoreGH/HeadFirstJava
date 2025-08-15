public class TestBox {
    private Integer i;
    private int j;
    public void go(){
        this.j = this.i; // This will cause a NullPointerException if i is null
        // To avoid the exception, you can use a null check or assign a default value
        System.out.println(j);
        System.out.println(i);
    }
}
