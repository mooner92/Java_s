import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class s404 extends JFrame{
    public s404(){
        setTitle("login window");
        setSize(300,150);
        JPanel panel = new JPanel();
        add(panel);

        panel.add(new JLabel("id     "));
        panel.add(new JTextField(20));
        panel.add(new JLabel("pass"));
        panel.add(new JPasswordField(20));

        JButton login = new JButton("login");
        panel.add(login);

        JButton cancel = new JButton("cancel");
        panel.add(cancel);
        setVisible(true);
    }
    public static void main(String[] args){
        new s404();
    }
}
