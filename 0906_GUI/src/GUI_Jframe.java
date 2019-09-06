import javax.swing.*;

public class GUI_Jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");

        JLabel label = new JLabel("오늘은 집 가는 날 너무 좋아 행복해");
        frame.add(label);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
