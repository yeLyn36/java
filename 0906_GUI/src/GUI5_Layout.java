import javax.swing.*;
import java.awt.*;

public class GUI5_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        BorderLayout bl = new BorderLayout();
        panel.setLayout(bl);

        JButton btn = new JButton("button" + 0);
        JButton btn1 = new JButton("button" + 1);
        JButton btn2 = new JButton("button" + 2);
        JButton btn3 = new JButton("button" + 3);
        JButton btn4 = new JButton("button" + 4);
        JButton btn5 = new JButton("button" + 5);
        panel.add(btn, BorderLayout.NORTH);
        panel.add(btn1, BorderLayout.WEST);
        panel.add(btn2, BorderLayout.EAST);
        panel.add(btn3, BorderLayout.SOUTH);
        panel.add(btn4, BorderLayout.CENTER);
        panel.add(btn5, BorderLayout.NORTH);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
