package ex_gui_1;

import javax.swing.JFrame;

public class swing_1 {
    public static void main(String[] args){
        JFrame f = new JFrame("Frame test");
        f.setTitle("myFrame");
        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
