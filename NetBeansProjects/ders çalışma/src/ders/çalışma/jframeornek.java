
package ders.çalışma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// Girilen sayıdan küçük 4k+1 türünde olan (5,9,13) sayıları yazdıran program
public class jframeornek extends jFreme{
    public static void main(String[] args) {
        
 
    JFrame jf= new JFrame();
    
    JLabel lb = new JLabel("Üst sayı:");
    lb.setBounds(40, 50, 70, 20);
    jf.add(lb);
    
        JTextField txt=new JTextField();
    txt.setBounds(120, 50, 50, 20);
    jf.add(txt);
    
        JButton bt=new JButton("Bul");
    bt.setBounds(180, 50, 70, 20);
    jf.add(bt);
    
    JLabel lb2=new JLabel();
    lb2.setBounds(20, 80, 300, 20);
    jf.add(lb2);
    
                  jf.setLayout(null);
    jf.setLocation(200, 300);
    jf.setSize(300,500);
    jf.setVisible(true);
    
    bt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
     
        int sayı = Integer.parseInt(txt.getText());
            String str=""; int k=0;  
            for (int i =0; i < sayı; i++) {
                k=i*4+1;
                if (k<sayı) {
                    str+=Integer.toString(k)+" ,";
                }
            }
             lb2.setText("Hilbert Sayıları: " + str); 
        }
    });
}   }

