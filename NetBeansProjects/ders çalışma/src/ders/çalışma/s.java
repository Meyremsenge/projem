
package ders.çalışma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class s {
    public static void main(String[] args) {
        
          JFrame jf= new JFrame("Hesap");
          
          JButton bt1 = new JButton("Hesapla");
         bt1.setBounds(50,50,40,40);
         jf.add(bt1);
         
          JLabel lb1= new JLabel("Sonuc:");
    lb1.setBounds(50,200,110,100);
    jf.add(lb1);
    
    
      JTextField txt1 = new JTextField(50); //karakter uzunluğu 
        txt1.setBounds(110,55,100,20); 
        jf.add(txt1); 
        
      jf.setLayout(null);
    jf.setLocation(200, 300);
    jf.setSize(300,500);
    jf.setVisible(true);
   

      
        bt1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  int sayi=Integer.parseInt(txt1.getText());
                  String S="";
                  while(sayi>0){
                      int i=0, ikikuvvet=1;
                      while(true){
                          ikikuvvet=2*ikikuvvet;
                          if(ikikuvvet>sayi){
                              ikikuvvet=ikikuvvet/2;
                          break;
                          }
                          i++;
                      }
                      S=S+"2^"+i+"+";
                      sayi=sayi-ikikuvvet;
                  }
                  lb1.setText("Sonuç : " + S);
              }
          });
                }
}