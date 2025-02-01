package ders.çalışma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class usalma extends jFreme{
    public static void main(String[] args) {
        
   
    jFreme jf = new jFreme();
    
      JLabel lb = new JLabel("Üst sayı:");
    lb.setBounds(40, 50, 70, 20);
    jf.add(lb);
    
        JLabel jLabel2 = new JLabel();
    jLabel2.setBounds(40, 40, 50, 30);
    jf.add(jLabel2);
    
        JButton jButton1 = new JButton();
        jButton1.setBounds(120, 70, 40, 40);
       jf.add(jButton1);
       
       JTextField  jTextField1=new JTextField();
       jTextField1.setBounds(120, 160, 70, 30);
        jf.add(jTextField1);
      
        
    jf.setLayout(null);
    jf.setLocation(200, 300);
    jf.setSize(300,500);
    jf.setVisible(true);
    

    
    
               // Üst kısmı yapamadım olmadı. Hata veriyor.
               // Sadece alt kısmı doğru. Büt 2. soru
      

    
    jButton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { {  
   
        int sayi = Integer.parseInt(jTextField1.getText());  
        if (sayi <= 0) {  
            jLabel2.setText("Lütfen pozitif bir sayı girin.");  
            return;  
        }  

        StringBuilder gosterim = new StringBuilder();  
        int kuvvet = 0;  
        while (sayi > 0) {  
            if (sayi % 2 == 1) {  
                if (gosterim.length() > 0) {  
                    gosterim.append("+");  
                }  
                gosterim.append("2^").append(kuvvet);  
            }  
            sayi /= 2;  
            kuvvet++;  
        }  

        jLabel2.setText("Gösterim: " + gosterim.toString());  

} 
}
 });
    }}