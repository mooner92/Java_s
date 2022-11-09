package ex_gui_1;

import javax.swing.*;
import java.awt.FlowLayout;

public class swing_2 extends JFrame{
    public swing_2(){
        setSize(300,200);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        add(button);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        swing_2 f = new swing_2();
    }
}
