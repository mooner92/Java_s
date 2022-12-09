import java.util.Vector;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

class point{
    int x;
    int y;
    public point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class s531_1 extends JFrame{
    int x,y;
    Vector<point> v = new Vector<>();

    class MyPanel extends JPanel{
        public MyPanel(){
            addMouseMotionListener(new MouseMotionAdapter(){
                public void mouseDragged(MouseEvent event){
                    x=event.getx();
                    y=event.gety();
                    v.add(new point(x,y));
                    repaint();
                }
            });
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(point p : v)
        g.fillOval(p.x,p.y,4,4);
    }
    public s531_1(){
        setSize(600,150);
        setTitle("s531_1");
        add(new MyPanel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] ars){
        s531_1 s = new s531_1();
    }
}
