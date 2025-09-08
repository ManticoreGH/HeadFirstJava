import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListExample implements ListSelectionListener {
    private static JList<String> list;
    public static void main(String[] args) throws Exception {
        ListExample gui = new ListExample();
        gui.go();   
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        String[] listEntries = {"alpha", "beta", "gamma", "delta",
                                "epsilon", "zeta", "eta", "theta"};
        list = new JList<>(listEntries);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);

        JScrollPane scroller = new JScrollPane(list);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(200, 150);
        frame.setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(!e.getValueIsAdjusting()) {
            String selection = list.getSelectedValue();
            System.out.println("Selected: " + selection);
        }
    }
}
