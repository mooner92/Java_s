
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class s433 extends JFrame{
    private JButton button1;
    private JButton button2;
    private JPanel panel;

    //MyListner listner  = new MyListner();

    public s433(){
        this.setSize(300,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("gg");
        panel = new JPanel();
        button1 = new JButton("yellow");
        button2 = new JButton("red");
        button1.addActionListener(e->{panel.setBackground(Color.yellow);});
        button2.addActionListener(e->{panel.setBackground(Color.red);});
        panel.add(button1);
        panel.add(button2);
        this.add(panel);
        this.setVisible(true);
    }
    public static void main(String[] args){
        s433 s = new s433();
    }

}
