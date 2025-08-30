import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /* Make a frame with a button */
        JFrame frame = new JFrame();
        JButton button = new JButton("Click Me"); /* You can pass the button constructor the text
        you want on the button. */

        /*
        * This line makes the program quit as soon as you close the window.
        * (if you leave this out it will just sit there on the screen forever)
        */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Add the button to the frame's content pane */
        frame.getContentPane().add(button);
        frame.setSize(300, 300); // Give the frame a size, in pixels
        /*
         *  Finally, make it visible!! (If you forget this step, you won't see anything when you run this code!)
         */
        frame.setVisible(true);

    }

}