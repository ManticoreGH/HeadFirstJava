
import java.awt.*;
import javax.swing.*;

public class CodeFragments {
    public static void main(String[] args) throws Exception {
        new CodeFragments().go();
    }

    public void go() {
        /*
         * Solution so far
         * 4-A
         * 6-B
         * 1-C
         * 2-D
         * 3-E
         */
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.DARK_GRAY);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
