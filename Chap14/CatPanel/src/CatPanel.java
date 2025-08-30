import java.awt.*;
import javax.swing.*;

public class CatPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("catzilla.png").getImage();
        g.drawImage(image, 3, 4, this);
    }
    
    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.add(new CatPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
