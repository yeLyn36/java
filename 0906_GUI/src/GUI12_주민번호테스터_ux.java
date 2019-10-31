import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI12_주민번호테스터_ux {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JTextField jm0 = new JTextField(10);
        JLabel lbMinus = new JLabel("-");
        JTextField jm1 = new JTextField(10);

        jm0.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
            @Override
            public void keyPressed(KeyEvent e) { }

            @Override
            public void keyReleased(KeyEvent e) {
                if(jm0.getText().length() == 6){
                    jm1.requestFocus();
                }
            }
        });
        jm1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(jm1.getText().length() == 7){
                    String jm = jm0.getText()+jm1.getText();

                    //맞는지 확인하자
                    if(isGood(jm)==true) { //isGood(jm)
                        //맞으면 lbMinus = "O"
                        lbMinus.setText("O");
                    }else{
                        //틀리면 lbMinus = "X"
                        lbMinus.setText("X");
                    }
                }
            }
        });

        panel.add(jm0);
        panel.add(lbMinus);
        panel.add(jm1);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static boolean isGood(String jm) {
        int[] mulN = {2,3,4,5,6,7,8,9,2,3,4,5};
        int sum=0;
        for(int i = 0;i<jm.length()-1;i++){
            sum+=(jm.charAt(i) - '0')*mulN[i];
        }
        //System.out.println(sum);

        int last = (11 - (sum % 11)) % 10;

        return (jm.charAt(jm.length()-1)-'0') == last;
    }
}
