
package ders.çalışma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class hesapmak {
    public static void main(String[] args) {
               JFrame jf= new JFrame("Hesap makinesi");
               
               
         JButton bt1 = new JButton("1");
         bt1.setBounds(50,50,40,40);
         jf.add(bt1);
        
        JButton bt2 = new JButton("2");
        bt2.setBounds(100,50,40,40);
        jf.add(bt2);
        
         JButton bt3 = new JButton("3");
        bt3.setBounds(150,50,40,40);
        jf.add(bt3);
        
         JButton bt4 = new JButton("4");
        bt4.setBounds(50,100,40,40);
        jf.add(bt4);
        
         JButton bt5 = new JButton("5");
        bt5.setBounds(100,100,40,40);
        jf.add(bt5);
        
         JButton bt6 = new JButton("6");
        bt6.setBounds(150,100,40,40);
        jf.add(bt6);
        
         JButton bt7 = new JButton("7");
        bt7.setBounds(50,150,40,40);
        jf.add(bt7);
        
         JButton bt8 = new JButton("8");
        bt8.setBounds(100,150,40,40);
        jf.add(bt8);
        
         JButton bt9 = new JButton("9");
        bt9.setBounds(150,150,40,40);
        jf.add(bt9);
        
         JButton bt0 = new JButton("0");
        bt0.setBounds(100,200,40,40);
        jf.add(bt0);
        
         JButton bttopla = new JButton(" + ");
        bttopla.setBounds(220,50,40,40);
        jf.add(bttopla);
        
         JButton btcikar = new JButton("-");
        btcikar.setBounds(220,100,40,40);
        jf.add(btcikar);
        
         JButton btcarp = new JButton("*");
        btcarp.setBounds(220,150,40,40);
        jf.add(btcarp);
        
         JButton btbol = new JButton("/");
        btbol.setBounds(220,200,40,40);
        jf.add(btbol);
        
            JLabel lb1= new JLabel("Sonuc:");
    lb1.setBounds(50,350,50,30);
    jf.add(lb1);
    
             JLabel lb2= new JLabel("Ekran:");
    lb2.setBounds(50,270,50,30);
    jf.add(lb2);
    
       jf.setLayout(null);
    jf.setLocation(200, 300);
    jf.setSize(300,500);
    jf.setVisible(true);

        
    }}
