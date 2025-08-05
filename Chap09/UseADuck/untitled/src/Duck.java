public class Duck {
    int size;

    public Duck(int duckSize) {
        if(duckSize == 0) {
            size = 27;
        } else {
            size = duckSize;
        }
    }

    public void setSize(int newSize){
        size = newSize;
    }
}
