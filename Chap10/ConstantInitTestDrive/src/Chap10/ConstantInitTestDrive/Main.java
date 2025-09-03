package Chap10.ConstantInitTestDrive;
public class Main {
    public static void main(String[] args) {
        ConstantInit1 c1 = new ConstantInit1();
        ConstantInit2 c2 = new ConstantInit2();
        ConstantInit3 c3 = new ConstantInit3();
        System.out.println("ConstantInit1.PI: " + ConstantInit1.PI);
        System.out.println("ConstantInit2.X_VALUE: " + ConstantInit2.X_VALUE);
        System.out.println("ConstantInit3.VAL: " + ConstantInit3.VAL);
        // if you don't initialize a constant, it throws an error
    }
}