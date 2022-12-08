import org.w3c.dom.events.MouseEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class s446 extends JFrame implements MouseListener , MouseMotionListener{
        public s446(){
            setTitle("mouseTest");
            setSize(300,200);
            JPanel panel = new JPanel();
            panel.addMouseListener(this);
            panel.addMouseMotionListener(this);
            add(panel);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
        public void mousePressed(MouseEvent e){
            System.out.println("MousePressed" + e);
        }
        public void mouseReleased(MouseEvent e){
            System.out.println("released");
        }
        public void mouseMoved(MouseEvent e){
            System.out.println("moved");
        }
        public void mouseDragged(MouseEvent e){
            System.out.println("Dragged");
        }
        public void mouseExited(MouseEvent e){
            System.out.println("Exited");
        }
        public void mouseEntered(MouseEvent e){
            System.out.println("Entered");
        }
        public void mouseClicked(MouseEvent e){
            System.out.println("Clicked");
        }
        
        public static void main(String[] args){
            s446 s = new s446();
        }
    
}
