import java.awt.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class SimpleAnimation {
    private int xPos = 70;
    private int yPos = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Simple Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawPanel drawPanel = new DrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            xPos++;
            yPos++;
            drawPanel.repaint();
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class DrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.green);
            g.fillOval(xPos, yPos, 40, 40);
        }
    }
}