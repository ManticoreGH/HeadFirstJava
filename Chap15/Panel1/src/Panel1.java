import java.awt.*;
import javax.swing.*;

public class Panel1 {
    public static void main(String[] args) throws Exception {
        Panel1 gui = new Panel1();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        JButton button = new JButton("shock me");
        panel.add(button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
