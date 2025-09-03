import java.awt.event.*;

public class LabelButtonListener implements ActionListener {
    /**
     * Gets the SimpleGUI3 instance.
     */
    private final SimpleGUI3 gui;

    /**
     * Constructor for LabelButtonListener.
     * @param gui the SimpleGUI3 instance
     */
    public LabelButtonListener(SimpleGUI3 gui) {
        this.gui = gui;
    }
    /**
     * Handles button click events.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.gui.getLabel().setText("That hurts!");
    }

}
