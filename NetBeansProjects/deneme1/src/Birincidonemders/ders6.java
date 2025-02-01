
package Birincidonemders;

import java.util.Scanner;


 
public class ders6 {
 
    /*
           // klavyeden 5 sayı gir. en büyük tek sayıyı bul
                              Scanner klavye = new Scanner(System.in);
                              System.out.println("5 tane sayı girin");
                              int enbuyuk=0;
                              for (int i = 0; i < 5; i++) {
                                 int sayı1 = klavye.nextInt();           
                                  if (sayı1%2!=0  && enbuyuk<sayı1) {
                                      enbuyuk=sayı1;                                                
                                  }            
                              }
                                  if (enbuyuk!=0) {
                                      System.out.println("En büyük tek sayı="+enbuyuk);
                                  } else {
                                      System.out.println("Tek sayı girilmemiştir");
                                  }
  
    
    
    // metindeki boşlukları bul 
    
                            Scanner klavye = new Scanner(System.in);
                            int sayac=0;
                              System.out.println("cümle girin");
                            String cumle= klavye.nextLine();
                                                for (int i = 0; i < cumle.length(); i++){
                                                    if (cumle.charAt(i)==' ') {
                                                        sayac++;
                                                        
                                                    }
                                                    System.out.println("Boşluk sayısı"+ sayac);

                                                        
                                                    }
                                                        
    
    
    
// exid girene kadar metin gir. girilen metinlerden en uzun olanı yazdır. kac kere kelime girdigini yazdır(sayac)
    
                                 Scanner klavye = new Scanner(System.in);
                             String metin=" ";
                             int enUzun = 0;  // en uzun metinin harf sayısı
                             int sayac=0;
                             String enUzunMetin=" ";  


                              
                              do {                        
                                  System.out.println("cümle girin");
                                  metin  = klavye.nextLine();
                                  sayac++;
                                  if ((metin.length())>enUzun) {
                                      enUzun=metin.length();
                                      enUzunMetin=metin;
                                  
                              }
                              }while (!metin.equals("EXIT"));
                                  System.out.println("En uzun metin="+enUzunMetin);
                                  System.out.println("En uzun metin uzunluğu="+ enUzun);
                                  System.out.println("Girilen string sayısı="+ sayac);
                                  
    
    
    
    // fibonaccı 10 a kadar
    
                              int fb1 =1;
                              int fb2=1;
                              
                              int fbn;
                              System.out.println("Fibonacci sayıları;");
                              System.out.println(fb1+" "+ fb2+" ");
                              for (int i = 3; i < 10; i++) {
                                  fbn=fb1+fb2;
                                  System.out.println(fbn+" ");
                                  fb1=fb2;
                                  fb2=fbn;                                 
                              }    
    
    
    
    
    // 1+ 1/2! + 1/3! + 1/4! + ...... +1/10!= sonucunu yazdıran program
    
                                  double toplam=1,fak;                        
                              for (int i = 2; i < 10; i++) {
                                  fak=1;
                                  for (int j = 1; j <= 10; j++) {
                                      fak= fak*j;
                                      
                                  }
                                  toplam=toplam+(1/fak);
                                  System.out.println(toplam);
                                  
                              }
                              System.out.println("Seri toplamı="+toplam);

    
    
    // 1+1/3!+1/4!...+1/49!
                                  double top=1,fak;
                              for (int i = 3; i <= 52; i++) {
                                  fak=1;
                                  for (int j = 1; j <= 52; j++) {
                                      fak= fak*j;
                                  }
                                  top= top+(1/fak);
                                  System.out.println(top);
                                          
                              }
                         System.out.println("Seri toplamı="+top);
    
    
    
    // 2  4  8  10  14  ...  sayılarını toplamını yazdır.  
    
                      int top=0;
                      int sonTop=0;
                      for (int i = 2; i < 100; i=i++)
                 {
                     if (i%2==0) {
                         top=top+2;
                         System.out.println(top);
                      i++;
                      sonTop=sonTop+top;
                     } else {
                         top=top+4;
                         System.out.println(top);
                              i++;
                              sonTop=sonTop+top;
                     }                 
 
               }
                              System.out.println("Hepsinin son toplamı="+sonTop);
                              
    
    
    
    
    // 8 yıldızı 1 er 1 er azalt.
             run:
*******
******
*****
****
***
**
*                    
                  for (int i = 8; i > 0; i--) {
                      for (int j = 0; j < i-1; j++) {
                          System.out.print("*");                         
                      }
                                        System.out.println("");
                  }
    
    
    
    */
                          public static void main(String[] args) {

 
                          }
                                                    
                              }

                          