/**
 * You need those two imports to make this work
 */
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * Make a subclass of JPanel, a widget that you can 
 * add to a frame just like anything else. Except this one
 * is your own customized widget.
 */
public class MyDrawPanel extends JPanel {
    /**
     * This is the Big important Graphics method.
     * You will NEVER call it yourself. The system
     * calls it and says, "Here's a nice fresh 
     * drawing surface, of type Graphics, that you
     * may paint now."
     */
    @Override
    public void paintComponent(Graphics g) {
        /**
         * The first two args define the (x, y) upper-left corner,
         * relative to the panel, for where drawing starts, so
         * 0,0 means "start 0 pixels from the left edge and 0 pixels from the top edge."
         * The other two say, "Make the width of this rectangle as wide as the panel (this.getWidth())
         * , and the height as tall as the panel (this.getHeight())."
         */
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        /**
         * Earlier, we used Math.random, but now we know how to use the Java libraries
         * we can use java.util.Random. It has a nextInt method that takes a max value
         * and returns a number between 0 (inclusive) and the max value (exclusive).
         * In this case 0-256.
         */
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        /**
         * You can make a Color by passing 3 ints to represent the RGB values.
         */
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        /**
         * g.fillOval start 70 pixels from the left,
         * 70 from the top, make it 100 pixels wide,
         * and 100 pixels tall.
         */
        g.fillOval(70, 70, 100, 100);
    }
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyDrawPanel());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
