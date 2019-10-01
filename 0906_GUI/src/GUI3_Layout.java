import javax.swing.*;
import java.awt.*;

public class GUI3_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        FlowLayout fl = new FlowLayout();     //  JPanel Default layout
        fl.setAlignment(FlowLayout.LEFT);
        for (int i = 0; i < 5; i++){
            JButton btn = new JButton("button" + i);
            panel.add(btn);
        }
        panel.setLayout(fl);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
