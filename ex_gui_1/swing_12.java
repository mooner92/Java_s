package ex_gui_1;
import java.awt.*;
import javax.swing.*;

public class swing_12 extends JFrame{
    public swing_12(){
        JPanel panel = new JPanel();
        add(panel);

        JLabel label1 = new JLabel("화씨 온도");
        JLabel label2 = new JLabel("섭씨 온도");
        JTextField field1 = new JTextField(15);
        JTextField field2 = new JTextField(15);
        JButton button = new JButton("변환");

        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button);

        setSize(300,150);
        //setSize(300,150);
        setTitle("온도 변환기");
        setVisible(true);
    }
    public static void main(String[] args){
        swing_12 s = new swing_12();
    }
}
