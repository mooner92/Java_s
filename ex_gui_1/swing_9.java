package ex_gui_1;

import javax.swing.*;
import java.awt.*;

public class swing_9 extends JFrame{
    private JPanel panel;
    private JLabel label1,label2;

    public swing_9(){
        setTitle("Label Test");
        setSize(400,150);
        panel = new JPanel();
        label1 = new JLabel("Color Label");
        label1.setForeground(Color.blue);
        label2 = new JLabel("Front Label");
        label2.setFont(new Font("Arial",Font.ITALIC,30));
        label2.setForeground(Color.orange);
        panel.add(label1);
        panel.add(label2);
        add(panel);
        setVisible(true);

    }
    public static void main(String[] args){
        swing_9 s= new swing_9();
    }
}
