package ex_gui_1;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class swing_3 extends JFrame{
    public swing_3(){
        setSize(300,200);
        setLocation(200,300);
        setTitle("swing_3 Frame");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.yellow);
        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");
        this.add(button1);
        this.add(button2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        swing_3 s = new swing_3();
    }
}
