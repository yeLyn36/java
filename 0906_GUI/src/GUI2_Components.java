import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI2_Components {
    public static void main(String[] args) {
        String [] food = {"떡볶이", "스테이크", "돼지고기"};
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JLabel lb = new JLabel("JLabel");
        JButton btn = new JButton("JButton");
        JCheckBox cbx = new JCheckBox("정한");
        JCheckBox cbx2 = new JCheckBox("우도환");
        JRadioButton rb = new JRadioButton("미성년자");
        JRadioButton rb2 = new JRadioButton("성인");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb2);
        JComboBox cb = new JComboBox(food);

        JTextField tf = new JTextField("JTextField");
        JTextArea ta = new JTextArea(2, 10);

        JPanel panelResult = new JPanel();
        JLabel labelResult = new JLabel("Result");

        cbx.setSelected(true);
        rb.setSelected(true);
        tf.setText("DEFAULT");

        tf.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) { //focus 받기
                if (tf.getText().equals("DEFAULT")) tf.setText("FOCUS");
            }

            @Override
            public void focusLost(FocusEvent e) { //focus 잃기
                if (tf.getText().equals("FOCUS")) tf.setText("DEFAULT");
            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getResult(lb, btn, cbx, cbx2, rb, rb2, cb, tf, ta, labelResult);
            }
        });

        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                getResult(lb, btn, cbx, cbx2, rb, rb2, cb, tf, ta, labelResult);
//                if(e.getSource() == cbx){
//                    System.out.println("cbx : " + cbx.isSelected());
//                }
//                else if (e.getSource() == cbx2) {
//                    System.out.println("cbx2 : " + cbx2.isSelected());
//                }
//                else if (e.getSource() == rb) {
//                    System.out.println("rb : " + rb.isSelected());
//                }
//                else if (e.getSource() == rb2) {
//                    System.out.println("rb2 : " + rb2.isSelected());
//                }
//                else if (e.getSource() == cb) {
//                    System.out.println(cb.getSelectedItem());
//                }
            }
        };
        cbx.addItemListener(il);
        cbx2.addItemListener(il);
        rb.addItemListener(il);
        rb2.addItemListener(il);
        cb.addItemListener(il);

        panel.add(lb);
        panel.add(btn);
        panel.add(cbx);
        panel.add(cbx2);
        panel.add(rb);
        panel.add(rb2);
        panel.add(tf);
        panel.add(ta);
        panel.add(cb);
        panel.add(labelResult);

        frame.add(panel);
//        frame.add(panelResult);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void getResult(JLabel lb, JButton btn, JCheckBox cbx, JCheckBox cbx2, JRadioButton rb, JRadioButton rb2, JComboBox cb, JTextField tf, JTextArea ta, JLabel labelResult) {
        String result = "";
        result += lb.getText();
        result += btn.getText();
        result += cbx.isSelected();
        result += cbx2.isSelected();
        result += rb.isSelected();
        result += rb2.isSelected();
        result += cb.getSelectedIndex();
        result += cb.getSelectedItem();
        result += tf.getText();
        result += ta.getText();
        labelResult.setText(result);
    }
}
