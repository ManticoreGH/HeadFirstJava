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
        // Change the layout manager to be a new instance of BoxLayout
        // The BoxLayout needs to the component it's laying out (ie., the panel)
        // and which axis to use (we use Y_AXIS for a vertical layout)
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
