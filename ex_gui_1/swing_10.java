package ex_gui_1;

import javax.swing.*;
import java.awt.*;

public class swing_10 extends JFrame{
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public swing_10(){
        setTitle("Label Test");
        setSize(1000,600);
        panel = new JPanel();
        label = new JLabel("Dog");
        ImageIcon icon = new ImageIcon("c://Users//y//Downloads//tri.png");
        label.setIcon(icon);
        button = new JButton("자세한 정보를 보려면 클릭하세요");
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);


    }
    public static void main(String[] args){
        swing_10 s = new swing_10();
    }
}
