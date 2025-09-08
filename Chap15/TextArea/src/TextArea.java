
import java.awt.BorderLayout;
import javax.swing.*;

public class TextArea {
    public static void main(String[] args) throws Exception {
        TextArea textArea = new TextArea();
        textArea.run();
    }

    private void run() {
        JFrame frame = new JFrame("Text Area Example");
        JPanel panel = new JPanel();

        JButton button = new JButton("Just Click It");

        JTextArea textArea = new JTextArea(10, 20);
        textArea.setLineWrap(true);
        button.addActionListener(e -> textArea.append("Button clicked!\n"));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JScrollPane scroller = new JScrollPane(textArea);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        panel.add(scroller);
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        
        frame.setSize(350, 300);
        frame.setVisible(true);
    }
}
