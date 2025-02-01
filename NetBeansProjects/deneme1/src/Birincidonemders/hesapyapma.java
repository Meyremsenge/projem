
package Birincidonemders;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class hesapyapma {
    public static void main(String[] args) {
            JFrame jf= new JFrame("Hesaplama");
    
    JLabel lb1= new JLabel("sayı1");
    lb1.setBounds(50,50,50,30);
    jf.add(lb1);
 
     JLabel lb2= new JLabel("sayı2");
    lb2.setBounds(50,100,50,30);
    jf.add(lb2);
    
            JTextField tf1= new JTextField();
        tf1.setBounds(110,55,100,20);
        jf.add(tf1);
        
    
        JTextField tf2= new JTextField();
        tf2.setBounds(110,105,100,20);
        jf.add(tf2);
        
         JButton bttopla = new JButton(" _+_ ");
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
        
        JLabel lb3= new JLabel("Sonuç : ");
        lb3.setBounds(110, 200, 200, 30);
        jf.add(lb3);
        
           jf.setLayout(null);
    jf.setLocation(200, 300);
    jf.setSize(400,400);
    jf.setVisible(true);
    
    
    
      bttopla.addActionListener(new ActionListener() {
         @Override
        public void actionPerformed(ActionEvent e){
            int sayi1,sayi2;
            double snc;
            
            sayi1 = Integer.parseInt(tf1.getText());
            sayi2 = Integer.parseInt(tf2.getText());
            
            snc= sayi1+sayi2;
            lb3.setText("Sonuç : "+Double.toString(snc));

                    }} ); 
      
            btcikar.addActionListener(new ActionListener() {
         @Override
        public void actionPerformed(ActionEvent e){
            int sayi1,sayi2;
            double snc;
            
            sayi1 = Integer.parseInt(tf1.getText());
            sayi2 = Integer.parseInt(tf2.getText());
            
            snc= sayi1-sayi2;
            lb3.setText("Sonuç : "+Double.toString(snc));

                    }} ); 
            
                  btcarp.addActionListener(new ActionListener() {
         @Override
        public void actionPerformed(ActionEvent e){
            int sayi1,sayi2;
            double snc;
            
            sayi1 = Integer.parseInt(tf1.getText());
            sayi2 = Integer.parseInt(tf2.getText());
            
            snc= sayi1*sayi2;
            lb3.setText("Sonuç : "+Double.toString(snc));

                    }} ); 
                  
                        btbol.addActionListener(new ActionListener() {
         @Override
        public void actionPerformed(ActionEvent e){
            int sayi1,sayi2;
            double snc;
            
            sayi1 = Integer.parseInt(tf1.getText());
            sayi2 = Integer.parseInt(tf2.getText());
            
            snc=(double)(sayi1/sayi2);
            lb3.setText("Sonuç : "+Double.toString(snc));

                    }} ); 
                        
    }
}
