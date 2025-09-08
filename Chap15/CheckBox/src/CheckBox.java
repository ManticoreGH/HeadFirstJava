import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class CheckBox implements ItemListener{
    private JCheckBox check = new JCheckBox("Goes to 11");
    public static void main(String[] args) throws Exception {
        CheckBox cb = new CheckBox();
        cb.check.setSelected(true);
        cb.run();
    }

    public void run() {
        JFrame frame = new JFrame("CheckBox Example");
        JPanel panel = new JPanel();

        check.addItemListener(this);

        panel.add(check);
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String onOrOff = "off";
        if(check.isSelected()) {
            onOrOff = "on";
        }
        System.out.println("Check box is " + onOrOff);
    }
}
