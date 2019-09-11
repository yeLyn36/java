import javax.swing.*;
import java.awt.*;

public class GUI_Jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");

        Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();

        int 화w = (int)dimen.getWidth();
        int 화h = (int)dimen.getHeight();
        int 창w = 400;
        int 창h = 200;

        frame.setPreferredSize(new Dimension(창w, 창h));
        frame.setLocation((화w-창w)/2, (화h-창h)/2);

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
