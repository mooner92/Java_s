package ex_gui_1;

import javax.swing.*;


import java.awt.*;
import java.awt.event.MouseListener;

public class swing_lec_1 extends JFrame implements MouseListener{
    JLabel label1;
    int count=0;
    public swing_lec_1(){
        setSize(300,150);
        setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        JButton b1 = new JButton("버튼을 눌러보세요!");
        addMouseListener(this);
        panel.add(b1,"Center");
        add(b1,"Center");
        JLabel label1 = new JLabel(String.format("%d",count));
        add(label1,"South");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    }
    @Override
    public synchronized void addMouseListener(MouseListener l) {
        
    }
    public static void main(String[] args){
        swing_lec_1 s = new swing_lec_1();
    }
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        count++;
        label1.setText(String.format("%d",count));
        
    }
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


}
