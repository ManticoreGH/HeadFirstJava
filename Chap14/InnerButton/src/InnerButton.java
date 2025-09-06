
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerButton {
    private JButton button;

    public static void main(String[] args) throws Exception {
        InnerButton gui = new InnerButton();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("A");
        button.addActionListener(new ButtonListener());

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (button.getText().equals("A")) {
                button.setText("B");
            } else {
                button.setText("A");
            }
        }
    }
}
