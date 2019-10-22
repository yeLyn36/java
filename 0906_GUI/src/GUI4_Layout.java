import javax.swing.*;
import java.awt.*;

public class GUI4_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        GridLayout gl = new GridLayout(2, 4);
        for (int i = 0; i < 5; i++){
            JButton btn = new JButton("button" + i);
            panel.add(btn);
        }
        panel.setLayout(gl);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
