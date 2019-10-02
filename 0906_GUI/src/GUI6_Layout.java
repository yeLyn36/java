import javax.swing.*;
import java.awt.*;

public class GUI6_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        BorderLayout bl = new BorderLayout();
        panel.setLayout(bl);

        JLabel lbtitle = new JLabel("SCENT");
        lbtitle.setHorizontalAlignment(JLabel.CENTER);
        JTextArea taList = new JTextArea(1, 10);
        JPanel eastPanel = new JPanel();
        int sum = 10000;
        JLabel lbsum = new JLabel("총 금액 : " + sum);
        JButton btPay = new JButton("결제하기");

        eastPanel.add(lbsum);
        eastPanel.add(btPay);
        panel.add(lbtitle, BorderLayout.NORTH);
        panel.add(taList, BorderLayout.CENTER);
        panel.add(eastPanel, BorderLayout.EAST);
        
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
