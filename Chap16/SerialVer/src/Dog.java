import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private int size;
    private static final long serialVersionUID = -2550857108198794083L;

    public Dog(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog [name=" + this.name + ", size=" + this.size + "]";
    }
}
