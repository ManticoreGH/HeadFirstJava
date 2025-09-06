
import java.awt.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class Animate {
    private int x = 1;
    private int y = 1;

    public static void main(String[] args) throws Exception {
        Animate gui = new Animate();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);
        for (int i = 0; i < 124; i++, y++, x++) {
            x++;
            drawP.repaint();
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class MyDrawP extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 500, 250);
            g.setColor(Color.BLUE);
            g.fillRect(x, y, 500 - x * 2, 250 - y * 2);
        }
    }
}
