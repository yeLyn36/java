import javax.swing.*;

public class GUI_Jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
