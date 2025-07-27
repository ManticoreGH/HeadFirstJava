class Boat {
    private int length;
    
    public void setLength(int len) {
        this.length = len;
    }
    
    public int getLength() {
        return length;
    }
    
    public void move(){
        System.out.println("drift");
    }
}

class RowBoat extends Boat {
    public void rowTheBoat() {
        System.out.println("stroke natasha");
    }
}

class SailBoat extends Boat {
    @Override
    public void move() {
        System.out.println("hoist sail");
    }
}

public class TestBoats {
    public static void main(String[] args) throws Exception {
        Boat b1 = new Boat();
        SailBoat b2 = new SailBoat();
        RowBoat b3 = new RowBoat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}