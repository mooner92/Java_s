import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class hw_n_454 extends JFrame implements ActionListener{
    private double result;
    private boolean flag = false;
    private JTextField jt;
    private String operator;
    private JPanel panel;
    private char c;
    //mylistner listner = new mylistner();
    String[] nums = {"Backspace","","","CE","C","7","8","9","/","sqrt","4","5","6","*","%","1","2","3","-","1/x","0","+/-",".","+","="};
    public hw_n_454(){
        this.setSize(520,180);
        jt = new JTextField(20);
        add(jt,BorderLayout.NORTH);
        panel = new JPanel();
        panel.setLayout (new GridLayout (5, 5));
        add (panel, BorderLayout.CENTER);
        for (int i = 0; i < 25; i++) {
            JButton btn = new JButton("" + nums[i]);
            if(i%5==3 || i%5==4){
                btn.setForeground(Color.red);
            }
            btn.setBackground(Color.yellow);
            btn.addActionListener(this);
            btn.setPreferredSize(new Dimension (100, 30));
            panel.add(btn);
        } 
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String acm = e.getActionCommand();
        if(acm.charAt(0)>=48 && acm.charAt(0)<58){
            
            jt.setText(jt.getText() + acm);
        }
        else{
            
            if(flag && acm.equals("=")){
                flag = false;
                if(operator.equals("+"))
                jt.setText((Double.parseDouble(acm)+result)+"");
                else if(operator.equals("-"))
                jt.setText((Double.parseDouble(acm)-result)+"");
                else if(operator.equals("/"))
                jt.setText((Double.parseDouble(acm)/result)+"");
                else if(operator.equals("*"))
                jt.setText((Double.parseDouble(acm)*result)+"");
            }
            else{
                flag = true;
                result = Double.parseDouble(jt.getText());
                operator = acm;
                jt.setText("");
            }
        }
    }
    public static void main(String[] args){
        hw_n_454 h = new hw_n_454();
    }

    
}