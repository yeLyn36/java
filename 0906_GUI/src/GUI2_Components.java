import javax.swing.*;
import java.awt.*;

public class GUI2_Components {
    public static void main(String[] args) {
        String [] food = {"떡볶이", "스테이크", "돼지고기"};
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JLabel lb = new JLabel("JLabel");
        JButton btn = new JButton("JButton");
        JCheckBox cbx = new JCheckBox("미성년자");
        JCheckBox cbx2 = new JCheckBox("성인");
        ButtonGroup bg = new ButtonGroup();
        bg.add(cbx);
        bg.add(cbx2);
        JComboBox cb = new JComboBox(food);
        JRadioButton rb = new JRadioButton("JRadioButton");
        JRadioButton rb2 = new JRadioButton("JRadioButton");
        JTextField tf = new JTextField("JTextField");
        JTextArea ta = new JTextArea(2, 10);

        panel.add(lb);
        panel.add(btn);
        panel.add(cbx);
        panel.add(cbx2);
        panel.add(rb);
        panel.add(rb2);
        panel.add(tf);
        panel.add(ta);
        panel.add(cb);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
