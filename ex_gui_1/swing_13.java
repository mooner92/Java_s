package ex_gui_1;

import javax.swing.*;
import java.awt.*;

public class swing_13 extends JFrame {
    public swing_13(){
        setSize(600,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("My Frame");

        JPanel panel = new JPanel();
        JPanel PanelA = new JPanel();
        JPanel panelB = new JPanel();

        
        JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다.");
        PanelA.add(label1);
        JButton button1 = new JButton("콤보피자");
        JButton button2 = new JButton("포테이토 피자");
        JButton button3 = new JButton("불고기피자");
        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);
        JLabel label2 = new JLabel("계수");
        JTextField field1 = new JTextField(10);
        panelB.add(label2);
        panelB.add(field1);

        panel.add(PanelA);
        panel.add(panelB);
        add(panel);
        setVisible(true);

    }
    public static void main(String[] args){
        swing_13 s = new swing_13();
    }
}
