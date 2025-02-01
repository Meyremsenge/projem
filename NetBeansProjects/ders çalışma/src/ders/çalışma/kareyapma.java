
package ders.çalışma;

import javax.swing.JButton;
import javax.swing.JFrame;


public class kareyapma {
    public static void main(String[] args) {
       JFrame jf= new JFrame("Hesap ");
        
        JButton b1 = new JButton("a");
        b1.setBounds(40, 80, 80, 80);
        jf.add(b1);
        
        JButton b2 = new JButton("b");
        b2.setBounds(80, 80, 80, 120);
        jf.add(b2);
        
        JButton b3 = new JButton("c");
        b3.setBounds(40, 120, 40, 80);
        jf.add(b3);
        
        JButton b4 = new JButton("d");
        b4.setBounds(40, 80, 120, 120);
        jf.add(b4);
    
    
        jf.setLayout(null);
    jf.setLocation(200, 300);
    jf.setSize(300,500);
    jf.setVisible(true);
   
    }
}
