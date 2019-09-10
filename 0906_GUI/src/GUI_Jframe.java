import javax.swing.*;

public class GUI_Jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("오늘은 집 가는 날 너무 좋아 행복해");
        JButton button = new JButton("꼬르륵");

        panel.add(label);
        panel.add(button);
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
