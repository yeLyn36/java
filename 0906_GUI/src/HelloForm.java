import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm {
    private JTextField inputTf;
    private JButton HelloBtn;
    private JLabel titleLb;
    private JLabel resultLb;
    private JPanel panel;
    public HelloForm(){
        HelloBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLb.setText("안녕 " + inputTf.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("인사하기");

        frame.add(new HelloForm().panel);


        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
