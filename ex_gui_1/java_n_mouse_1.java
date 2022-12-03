package ex_gui_1;

import javax.swing.*;
import java.awt.*;

class point {
    int x,y;
    public point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class java_n_mouse_1 {
    int x,y;

    class mypanel extends JPanel {
        public mypanel(){
            addMouseMotionListener(new MouseMotionAdapter(){
                public void mousePressed()
            });
        }
    }
}
