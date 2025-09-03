package Chap10.ConstantInitTestDrive;
public class ConstantInit3 {
    public static final double VAL;
    // This static block initializes the constant VAL
    // It is executed when the class is loaded, before any instance is created
    // or any static method is called.
    // This is useful for constants that require some computation or initialization
    // that cannot be done at compile time.
    // Note: This is not a compile-time constant, but a runtime constant.
    // It can be used to initialize constants that depend on runtime values.
    static {
        VAL = Math.random();
    }
}
