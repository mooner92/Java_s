import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import org.w3c.dom.events.MouseEvent;
public class s531 extends JFrame {
    class MyPanel extends JPanel{
        public MyPanel(){
            addMouseMotionListener(new MouseMotionAdapter(){
                public void mouseDragged(MouseEvent e){
                    public void paintComponent(Graphics g){
                        super.paintComponent(g);
                        g.setColor(Color.BLACK);
                        g.fillOval(e.getx()-10,e.gety()-10,20,20);
                    }
                }
            });
        }
        public s531(){
            setSize(1000,1000);
            add(new MyPanel());
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public static void main(String[] args){
            s531 s = new s531();
        }
    }
}
    
