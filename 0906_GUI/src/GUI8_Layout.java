import javax.swing.*;
import java.awt.*;

public class GUI8_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        ImageIcon ii = new ImageIcon(GUI8_Layout.class.getResource("instagram.png"));
        ImageIcon editIi = new ImageIcon(ii.getImage().getScaledInstance(
                ii.getIconWidth()/10, ii.getIconHeight()/10, Image.SCALE_DEFAULT));
        JLabel lb = new JLabel(editIi);

        panel.add(lb);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
