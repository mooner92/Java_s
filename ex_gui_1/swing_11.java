package ex_gui_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

;
public class swing_11 extends JFrame {
    public swing_11(){
        setTitle("log in window");
        setSize(300,150);

        JPanel panel = new JPanel();
        add(panel);
        panel.add(new JLabel("id    "));
        panel.add(new JTextField(20));
        panel.add(new JLabel("Pass"));
        panel.add(new JPasswordField(20));

        JButton login = new JButton("long in");
        panel.add(login);
        JButton cancel =  new JButton("cancel");
        panel.add(cancel);
        setVisible(true);

    }
    public static void main(String[] args){
        swing_11 s =new swing_11();
        
    }
}
