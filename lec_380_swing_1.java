import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
public class lec_380_swing_1 extends JFrame{
    public lec_380_swing_1(){
        setSize(300,200);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        JLabel lable = new JLabel("자바는 재미있나요?");
        JButton button = new JButton("yes");
        JButton button1 = new JButton("no");
        
        add(lable).setLocation(280, 170); //작동안됨
        add(button);
        add(button1);
        getContentPane().setBackground(Color.yellow);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        lec_380_swing_1 f = new lec_380_swing_1();
    }
}
