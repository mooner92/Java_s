package ex_gui_1;


import javax.swing.*;
import java.awt.*;

public class swing_4 extends JFrame{
    public swing_4(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton b1 = new JButton("Button 1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button 2");
        b2.setBackground(Color.green);

        panel.add(b1);
        panel.add(b2);
        add(panel);
        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String[] args){
        swing_4 s = new swing_4();
    }
    
}
