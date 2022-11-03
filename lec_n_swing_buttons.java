import javax.swing.*;
import java.awt.*;

public class SB extends JFrame {
    private JPanel panel;
    //private Jbutton[] buttons;

    public SB() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5));
        
        for (int i = 0; i < 20; i++) {
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);
            JButton button = new JButton();
            button.setBackground(new Color(r,g,b));
            panel.add(button);
        }
    }
}

public class lec_n_swing_buttons {
    
    SB s = new SB();
    public static void main(String[] args) {
        
    }
}
