import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI9_SamllWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton btn1 = new JButton("작은 창1");
        JButton btn2 = new JButton("작은 창2");
        JDialog dialog = new JDialog(frame, "다이얼로그", true);
        dialog.setPreferredSize(new Dimension(100, 100));
        dialog.pack();
        JLabel lb = new JLabel("레이블");
        dialog.add(lb);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // JOptionPane.showInputDialog(frame, "메세지", "제목", JOptionPane.INFORMATION_MESSAGE);
                // int select = JOptionPane.showConfirmDialog(null, "저장할까요?");
//                String luckynumber = JOptionPane.showInputDialog(frame, "메세지", "제목", JOptionPane.INFORMATION_MESSAGE);
//                System.out.println(luckynumber);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });

        panel.add(btn1);
        panel.add(btn2);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
