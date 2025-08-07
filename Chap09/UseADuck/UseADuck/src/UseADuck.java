public class UseADuck {
    public static void main(String[] args) {
        Duck d = new Duck(0);
        Duck2 d2 = new Duck2(15);
        Duck2 d3 = new Duck2();
        System.out.println("Duck size: " + d.size);
        System.out.println("Duck2 size: " + d2.getSize());
        System.out.println("Duck2 default size: " + d3.getSize());
    }
}
