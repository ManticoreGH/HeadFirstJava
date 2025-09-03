/**
 * You need those two imports to make this work
 */
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class MyDrawPanel2D extends JPanel {
    /**
     * It's really a graphic2D object masquerading as a mere Graphics object.
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Random random = new Random();
        int red = random.nextInt(256);
        int blue = random.nextInt(256);
        int green = random.nextInt(256);
        Color startColor = new Color(red,green,blue);

        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyDrawPanel2D());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

