import javax.swing.JFrame;
import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;

public class s452 extends JFrame{
    JPanel panel;

    public s452(){
        setTitle("Mouse Event");
        setSize(300,200);
        panel = new JPanel();
        panel.addMouseMotionListener(new MouseAdapter(){  //왜 안되지 ;;;
            public void mouseDragged(MouseEvent e){
                System.out.println(e);
            }
        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        s452 s = new s452();
    }
    
}
