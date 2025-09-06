import java.awt.*;
import javax.swing.*;

public class Panel2 {
    public static void main(String[] args) throws Exception {
        Panel2 gui = new Panel2();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.darkGray);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        
        panel.add(button);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
