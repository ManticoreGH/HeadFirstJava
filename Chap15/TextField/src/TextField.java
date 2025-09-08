import java.awt.*;
import javax.swing.*;

public class TextField {
    public static void main(String[] args) throws Exception {
        TextField swingComponents = new TextField();
        swingComponents.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Dog's first name:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");
        button.addActionListener(e -> {
            String name = textField.getText();
            System.out.println("Dog's name is: " + name);
        });
        textField.requestFocus();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        frame.getContentPane().add(BorderLayout.NORTH,panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
