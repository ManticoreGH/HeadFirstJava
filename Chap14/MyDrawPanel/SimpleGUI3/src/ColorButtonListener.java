
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButtonListener implements ActionListener {
    /** The SimpleGUI3 instance */
    private final SimpleGUI3 gui;

    /**
     * Constructor for ColorButtonListener.
     * @param gui the SimpleGUI3 instance
     */
    public ColorButtonListener(SimpleGUI3 gui) {
        this.gui = gui;
    }
    /**
     * Handles button click events.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.gui.getFrame().repaint();
    }

}
