import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SCENToday");
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 111+60, 97+60));
        JLabel titleLb = new JLabel("SCNET, today");
        titleLb.setSize(200, 30);

        panel.add(titleLb);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(1000, 800));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}