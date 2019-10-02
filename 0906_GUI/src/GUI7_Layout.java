import javax.swing.*;
import java.awt.*;

public class GUI7_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setLayout(null);
        JButton bt0 = new JButton();
        JButton bt1 = new JButton();
        bt0.setBounds(100, 200, 300, 400);
        bt1.setBounds(100, 200, 400, 200);

        panel.add(bt0);
        panel.add(bt1);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
