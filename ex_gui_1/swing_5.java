package ex_gui_1;

import javax.swing.*;
import java.awt.*;

public class swing_5 extends JFrame{
    public swing_5(){
        setTitle("FlowLayoutTest");
        setSize(300,150);
        setLayout(new FlowLayout());
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String[] args){
        swing_5 s = new swing_5();
    }
}
