import java.awt.BorderLayout;
import javax.swing.*;
public class SimpleGUI3 {
    JFrame frame;
    JButton colorButton;
    JButton labelButton;
    JLabel label;
    
    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JButton getColorButton() {
        return colorButton;
    }

    public void setColorButton(JButton colorButton) {
        this.colorButton = colorButton;
    }

    public JButton getLabelButton() {
        return labelButton;
    }

    public void setLabelButton(JButton labelButton) {
        this.labelButton = labelButton;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public static void main(String[] args) throws Exception {
        SimpleGUI3 gui = new SimpleGUI3();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        colorButton = new JButton("Change Color");
        labelButton = new JButton("Change Label");
        /**
         * Creates a new ColorButtonListener & LabelButtonListener.
         */
        ColorButtonListener colorButtonListener = new ColorButtonListener(this);
        LabelButtonListener labelButtonListener = new LabelButtonListener(this);
        colorButton.addActionListener(colorButtonListener);
        labelButton.addActionListener(labelButtonListener);
        label = new JLabel();
        label.setText("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
