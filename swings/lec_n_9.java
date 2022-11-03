package swings;
import javax.swing.*;

public class MyFrame extends JFrame {
    private JPanel panel;
    private JLabel[] jl = new JLabel[30];

    public MyFrame() {
        setSize(1000, 500);
        setLayout(null);
        panel = new JPanel();
        for (int i = 0; i < 30; i++) {
            int r = (int) (100 * Math.random());
            jl[i] = new JLabel();
            jl[i].setText("" + r);
            jl[i].setLocation((int) (1000 * Math.random()), (int) (500 * Math.random()));
            panel.add(jl[i]);
        }
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args){
         new MyFrame();
    }
}
/* 
public class lec_n_9 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }

    //f();

}
*/