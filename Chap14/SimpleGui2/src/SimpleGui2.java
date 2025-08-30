import javax.swing.*;
/* A new import statement for the package that ActionListener and ActionEvent are in */
import java.awt.event.*;

/**
 * Implement the interface. This says "an instance of SimpleGui2 is an ActionListener"
 * (The Button will give events only to ActionListeners implementers)
  */
public class SimpleGui2 implements ActionListener {
    private JButton button;

    /**
     * NOTE:
     * You wouldn't usually make your main GUI class implement ActionListener like this;
     * this is just the simplest way to get started. We'll see better ways of creating ActionListeners
     * later.
     */
    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        /**
         * Register your interest with the button. This says to the button,
         * "Add me to your list of listeners." The argument you passed MUST be an object of a class
         * that implements ActionListener!!
         */
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    /**
     * Implement the ActionListener interface's actionPerformed() method.
     * This is the method. This is the actual method.
     * This is actual event-handling method.
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setText("I've been clicked!");
        System.out.println("I've been clicked!");
    }
}