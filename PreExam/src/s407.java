import java.awt.*;
import javax.swing.*;

public class s407 extends JFrame{
    public s407(){
        setSize(600,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하세요.");
        panelA.add(label1);
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        panelB.add(b1);
        panelB.add(b2);
        panelB.add(b3);
        panelB.add(new JLabel("개수 : "));
        panelB.add(new JTextField(10));
        panel.add(panelA);
        panel.add(panelB);
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args){
        new s407();
    }
}
