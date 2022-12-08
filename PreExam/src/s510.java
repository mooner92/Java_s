import javax.swing.*;
import java.awt.*;
public class s510 extends JFrame{
    class MyPanel extends JPanel{
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawOval(60,50,60,60);
            g.drawRect(120,50,60,60);
            g.setColor(Color.BLUE);
            g.fillOval(180,50,60,60);
            g.fillRect(240,50,60,60);
        }
    }
    public s510(){
        setTitle("Basic Painting");
        setSize(600,200);
        add(new MyPanel());
        setVisible(true);
    }
    public static void main(String[] args){
        s510 s = new s510();
    }

}
