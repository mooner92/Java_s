import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class s427 extends JFrame{
    private JButton button;
    private JLabel label;
    int cnt=0;
    
    
        public void actionPerformed(ActionEvent e){
            cnt++;
            label.setText("현재의 카운터 값:   "+cnt);
        }
    
    public s427(){
        setSize(400,150);
        setTitle("이벤트 예제");
        setLayout(new FlowLayout());
        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값:   "+cnt);
        button.addActionListener(this);
        add(label,"Center");
        add(button,"East");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        s427 s = new s427();
    }
    
}
