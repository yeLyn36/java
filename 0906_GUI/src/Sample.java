import javax.swing.*;
import java.awt.*;

public class Sample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel lb = new JLabel("sk");
        lb.setHorizontalAlignment(JLabel.LEFT);

        panel.add(lb);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
