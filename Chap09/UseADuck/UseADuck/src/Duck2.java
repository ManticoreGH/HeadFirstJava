public class Duck2 {
    int size;

    public Duck2() {
        // supply  default size
        size = 27;
    }

    public Duck2(int duckSize) {
        // use duckSize parameter
        size = duckSize;
    }

    public void setSize(int newSize) {
        size = newSize;
    }

    public int getSize() {
        return size;
    }
}
