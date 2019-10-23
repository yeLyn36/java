import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI10_KeyEvent{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField tf1 = new JTextField(10);
        JLabel lb = new JLabel("-");
        JTextField tf2 = new JTextField(10);

        tf1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(e.getKeyCode() == e.VK_LEFT){
                    tf1.setText("");
                }
                else if(e.getKeyCode() == e.VK_RIGHT){
                    tf2.setText("");
                }
                else if(e.getKeyCode() == e.VK_UP){
                    tf1.setText("Press UP");
                }
                else if(e.getKeyCode() == e.VK_DOWN){
                    tf2.setText("Press DOWN");
                }
                else if(e.getKeyChar() == 'q'){
                    tf2.setText("QQQQQQQ");
                }
            }
        });

        panel.add(tf1);
        panel.add(lb);
        panel.add(tf2);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
