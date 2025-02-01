
package ders.çalışma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class hesapmakinesi{
   
    public static void main(String[] args) {
        

           JFrame jf= new JFrame("Hesap");
         
                       JLabel lb1= new JLabel("sayı 1");
    lb1.setBounds(10,20,110,20);
    jf.add(lb1);
    
          JLabel lb2= new JLabel("Sayı 2");
    lb2.setBounds(10,40,110,20);
    jf.add(lb2);
    
              JLabel lb3= new JLabel("İşlem türü:");
    lb3.setBounds(10,60,110,20);
    jf.add(lb3);
    
              JLabel lb4= new JLabel();
    lb4.setBounds(120,80,110,20);
    jf.add(lb4);
    
      JTextField txt1 = new JTextField(5);
        txt1.setBounds(120,20,100,20); 
        jf.add(txt1); 
        
           JTextField txt2 = new JTextField(5); 
        txt2.setBounds(120,40,100,20); 
        jf.add(txt2); 

       JButton bt1 = new JButton("Hesapla");
         bt1.setBounds(10,80,100,20);
         jf.add(bt1);
        
         String[] s={"Toplam","Fark","Bölme","Çarpma"};
         
         JComboBox secim = new JComboBox(s);
         secim.setBounds(120,60,110,20);
         jf.add(secim);
         
              jf.setLayout(null);
    jf.setLocation(200, 300);
    jf.setSize(300,500);
    jf.setVisible(true);
    
    bt1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   int s1=Integer.parseInt(txt1.getText());
                   int s2=Integer.parseInt(txt2.getText());
                   String islem = (String) secim.getSelectedItem(); 
                   int sonuc=0;
                   if (islem.equals("Toplam")) {
                      lb4.setText("sonuc"+(s1+s2));
                   } else if (islem.equals("Fark")) {
                       lb4.setText("sonuc"+(s1-s2)); 
                   } else if (islem.equals("Bölme")) {
                       lb4.setText("sonuc"+(s1/s2));
                   } else {
                       lb4.setText("sonuc"+(s1*s2));
                   }

                 }
    });
    }
    }