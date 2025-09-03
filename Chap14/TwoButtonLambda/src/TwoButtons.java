import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class TwoButtons {
    private JFrame frame;
    private JLabel label;
    
    public static void main(String[] args) throws Exception {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(event -> label.setText("Ouch!"));

        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(event -> frame.repaint());

        label = new JLabel("I am a label");
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500, 400);
        frame.setVisible(true);
    }
    
    private class MyDrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            Random random = new Random();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillOval(70, 70, 100, 100);
        }
    }
}
