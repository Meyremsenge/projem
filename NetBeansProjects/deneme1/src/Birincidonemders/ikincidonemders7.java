
package Birincidonemders;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
//Kullanıcı adı ve şifre yazma

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ikincidonemders7 {
    public static void main(String[] args) {
        
    JFrame jf= new JFrame("Giriş");
    
    JLabel lb1= new JLabel("K adı");
    lb1.setBounds(50,50,50,30);
    jf.add(lb1);
    
     JLabel lb2= new JLabel("Parola");
    lb2.setBounds(50,100,50,30);
    jf.add(lb2);
    
        JTextField tf= new JTextField();
        tf.setBounds(100,50,50,30);
        jf.add(tf);
        
          JTextField tf2= new JTextField();
        tf2.setBounds(100,100,50,30);
        jf.add(tf2);      
        
        JButton bt = new JButton("Giriş");
        bt.setBounds(110,150,100,20);
        jf.add(bt);
        
        JLabel lb3= new JLabel("Hoş geldiniz");
      
    
    jf.setLayout(null);
    jf.setSize(400,500);
    jf.setVisible(true);

    }
}



//Vize ve final hesaplama

   public static void main(String[] args) {
        
    JFrame jf= new JFrame("Not Hesaplama");
    
    JLabel lb1= new JLabel("Vize");
    lb1.setBounds(50,50,50,30);
    jf.add(lb1);
 
     JLabel lb2= new JLabel("Final");
    lb2.setBounds(50,100,50,30);
    jf.add(lb2);
    
    
        JTextField tf1= new JTextField();
        tf1.setBounds(110,55,100,20);
        jf.add(tf1);
        
    
        JTextField tf2= new JTextField();
        tf2.setBounds(110,105,100,20);
        jf.add(tf2);
        
        JButton bt = new JButton("Hesapla");
        bt.setBounds(110,150,100,20);
        jf.add(bt);
        
        JLabel lb3= new JLabel("Sonuç : ");
        lb3.setBounds(110, 200, 200, 30);
        jf.add(lb3);
        
        JLabel lb4= new JLabel("Durum : ");
        lb4.setBounds(110, 250, 100, 30);
        jf.add(lb4);
      
    jf.setLayout(null);
    jf.setLocation(200, 300);
    jf.setSize(400,400);
    jf.setVisible(true);


  bt.addActionListener(new ActionListener() {
         @Override
    
     
    public void actionPerformed(ActionEvent e){
            int v,f;
            double ort;
            
            v = Integer.parseInt(tf1.getText());
            f = Integer.parseInt(tf2.getText());
            
            ort= v*0.4 + f*0.6;
            lb3.setText("Sonuç : "+Double.toString(ort));
                    if(ort<50  || f<50 ){
                        lb4.setText("Kaldı");
                    }else{
                         lb4.setText("Geçti");
                    }
                    }});
}
    }


// 


*/



public class ikincidonemders7 {
 
    
    public static void main(String[] args) {
       JFrame jf= new JFrame("Not Hesaplama");
    
    JLabel lb1= new JLabel("Vize");
    lb1.setBounds(50,50,50,30);
    jf.add(lb1);
 
     JLabel lb2= new JLabel("Final");
    lb2.setBounds(50,100,50,30);
    jf.add(lb2);
    
    
        JTextField tf1= new JTextField();
        tf1.setBounds(110,55,100,20);
        jf.add(tf1);
        
    
        JTextField tf2= new JTextField();
        tf2.setBounds(110,105,100,20);
        jf.add(tf2);
        
        JButton bt = new JButton("Hesapla");
        bt.setBounds(110,150,100,20);
        jf.add(bt);
        
        JLabel lb3= new JLabel("Sonuç : ");
        lb3.setBounds(110, 200, 200, 30);
        jf.add(lb3);
        
        JLabel lb4= new JLabel("Durum : ");
        lb4.setBounds(110, 250, 100, 30);
        jf.add(lb4);
      
    jf.setLayout(null);
    jf.setLocation(200, 300);
    jf.setSize(400,400);
    jf.setVisible(true);


  bt.addActionListener(new ActionListener() {
         @Override
    
     
    public void actionPerformed(ActionEvent e){
            int v,f;
            double ort;
            
            v = Integer.parseInt(tf1.getText());
            f = Integer.parseInt(tf2.getText());
            
            ort= v*0.4 + f*0.6;
            lb3.setText("Sonuç : "+Double.toString(ort));
                    if(ort<50  || f<50 ){
                        lb4.setText("Kaldı");
                    }else{
                         lb4.setText("Geçti");
                    }
                    }} );   //paranrtezi kapatmayı unutma

    
  /*
  //  Çözüm 2?
    bt.addActionListener((ActionEvent e) -> {
      int v,f;
      double ort;
      v = Integer.parseInt(tf1.getText());
      f = Integer.parseInt(tf2.getText());
      ort= v*0.4 + f*0.6;
      lb3.setText("Sonuç : "+Double.toString(ort));
      if(ort<50  || f<50 ){
          lb4.setText("Kaldı");
      }else{
          lb4.setText("Geçti");
      }
       });   //paranrtezi kapatmayı unutma
}
  
  */
    }
    }