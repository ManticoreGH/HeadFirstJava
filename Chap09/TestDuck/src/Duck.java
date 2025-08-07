import java.util.Arrays;

public class Duck {
    private int kilo = 6;
    private float floatability = 2.1F;
    private String name = "Generic";
    private long[] feathers = {1, 2, 3, 4, 5, 6, 7};
    private boolean canFly = true;
    private int maxSpeed = 25;

    public Duck() {
        // Default constructor
        System.out.println("type 1 duck");
    }

    public Duck(boolean fly){
        this.canFly = fly;
        System.out.println("type 2 duck");
    }

    public Duck(String n, long[] f) {
        this.name = n;
        this.feathers = f;
        System.out.println("type 3 duck");
    }

    public Duck(int w, float f) {
        this.kilo = w;
        this.floatability = f;
        System.out.println("type 4 duck");
    }

    public Duck(float density, int max){
        this.floatability = density;
        this.maxSpeed = max;
        System.out.println("type 5 duck");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "kilo=" + kilo +
                ", floatability=" + floatability +
                ", name='" + name + '\'' +
                ", feathers=" + Arrays.toString(feathers) +
                ", canFly=" + canFly +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
