import javax.swing.*;
import java.awt.FlowLayout;
public class lec_380_swing_1 extends JFrame{
    public lec_380_swing_1(){
        setSize(300,200);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        JButton button = new JButton("button");
        JLabel lable = new JLabel("안녕하세요.");
        add(button);
        add(lable).setLocation(280, 170); //작동안됨
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        lec_380_swing_1 f = new lec_380_swing_1();
    }
}
