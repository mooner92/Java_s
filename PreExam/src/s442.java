import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class s442 extends JFrame{
    int x_img = 150,imy_y=150;
    JButton button;

    public s442(){
        setSize(1000,700);
        button = new JButton("");
        ImageIcon icon = new ImageIcon("c:\\Desktop\\whale_1.jpg");

        button.setIcon(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(x_img,imy_y);
        button.setSize(200,100);
        panel.add(button);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addKeyListner(new KeyListner){
            
        }
    }
}
