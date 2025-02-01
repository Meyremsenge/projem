
package Birincidonemders;

import java.util.Scanner;

public class ders7 {
    
    /*
    
    // Klavyeden girilen sayıdan dizde kaç tane vardır
                             Scanner klavye = new Scanner(System.in);
                          System.out.println("Bir sayı giriniz");
                          int sayı= klavye.nextInt();
                          int adet= 0;
                          int [] dizi= { 1, 4, 5, 8, 4, 1, 2, 3, 6, 7, 9, 3, 5};
                          for (int i = 0; i < dizi.length; i++) {
                              if (sayı== dizi[i]) {
                                  adet++;
                                  
                              }
                                 }
                              if (adet>0) {
                                  System.out.println("Dizide "+ sayı + " sayısı "+ adet +" tane vardır ");
                                  
                              } else {
                                  System.out.println("Dizide "+ sayı+" sayısı bulunmamaktadır.");
                           
                          }
     
                  }
}
    
    
      //   Kaç tane sesli harf vardır ?

                                  Scanner klavye = new Scanner(System.in);
                          System.out.println("Bir kelime giriniz");
                         String metin= klavye.nextLine();
                          int adet= 0;
                          char [] dizi= { 'a', 'e', 'ı','i','o','ö','u','ü'};
                          for (int i = 0; i <dizi.length ; i++) {
                              for (int j = 0; j < metin.length(); j++) {
                             if (metin.charAt(j)==dizi[i]) {
                                  adet++;
                                       }
                              }
                          }
                          System.out.println(adet+" tane sesli harf var.");
    
    
    
    //  klavyeden gün ve kaç gün sonraki gün bilgisini alarak , o kadar sonraki günü hesapla
    
                             Scanner klavye = new Scanner(System.in);
                         System.out.println("Bir gün giriniz");
                         String gun= klavye.nextLine();
                         System.out.println("Kaç gün sonrasını yazdıracağız");
                         int kacsonrakigun= klavye.nextInt();
                         int bugun=0;
                         String sonrakiGun;
                         String [] gunler= {"Pazartesi", "Sali","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
                          for (int i = 0; i < gunler.length; i++) {
                              if (gun == gunler[i]) {
                                  bugun=i;
                              }   
                              sonrakiGun=gunler[(bugun+kacsonrakigun)%7];     //  %7 demek modunu almak demek. sayarken başa dönmesini sağlar.
                          
                          System.out.println(kacsonrakigun+" gün sonraki gün "+ sonrakiGun);                          
}
                         
    
           // !-) Başlangıçtak girilen dizin sayısına göre büyüklüğünü belirleyecek ve 50-60 arasında rastgele tamsayılar üretecektir
       // 2-) Bu tam sayılar arasında aynı olan varsa bunların kaç kere geçtiğini yazdıracaktır.
                        
                             Scanner klavye = new Scanner(System.in);
                   // 1-) 
                         System.out.println("Kaç eleman gireceksiniz");
                         int elemanSayisi= klavye.nextInt();
                         int[] dizi= new int[elemanSayisi];
                          for (int i = 0; i < elemanSayisi; i++) {
                              dizi[i] = (int)(50+Math.random()*10);
                          }
                          for (int i = 0; i < elemanSayisi; i++) {
                              System.out.println(dizi[i]);
                          }
                     //2-)
                          for (int i = 0; i < dizi.length; i++) {
                              
                          }
    
    
    
    
    //1-) 5 partinin aldığı oyları, 2-) Her partinin aldığı oyun yüzdesi ,3-) En fazla oy alan partiden en az partiye sıralanma
    
                             String [] partiler ={"A", "B", "C", "D", "E"};
                          int [] oylar= new int[5];
                          
                          for (int i = 0; i < oylar.length; i++) {
                              oylar[i] = (int)(50+(Math.random()*50));
                          }
                      // 1-)
                          for (int i = 0; i < oylar.length; i++) {
                              System.out.println(partiler[i] + " partisi "+ oylar[i] + " oy almıştır.");
                          }
                       System.out.println("------------------------------------");
                      // 2-)    
                          float toplam =0;
                          for (int i = 0; i < oylar.length; i++) {
                              toplam+=oylar[i];
                          }
                          for (int i = 0; i < oylar.length; i++) {
                              double oyoranı= (int)(10000*(oylar[i]/toplam)/100.0);   // 0 dan sonrasını siler
                              System.out.println(partiler[i] +" Partisi " + oyoranı +" yüzdesinde oy almıştır.");    
                          //   System.out.println(partiler[i] +" Partisi " + 100*(oylar[i]/toplam) 
                            //          +" yüzdesinde oy almıştır.");  //  System.out.println(100.0 * oylar[i]  / toplam);  ( bu işlem de sonucu double yapar.
                          }
                          
                          System.out.println("------------------------------------");
                         // 3-)
                         
                          for (int j = 0; j < oylar.length; j++) {
                              
                          
                         int ebIndis = j;                // Integer.MAX_VALUE;
                          for (int i = j; i < oylar.length; i++) {
                              if (oylar[i]>oylar[ebIndis]) ;
                                  ebIndis= i;
                                  
                          }
                          int temp = oylar[j] ;               //temp=geçici
                          oylar[j]= oylar[ebIndis];
                          oylar[ebIndis]=temp;
                          
                          String temp2 = partiler[j] ;              
                          partiler[j]= partiler[ebIndis];
                          partiler[ebIndis]=temp2;
                          
                          }
                          for (int i = 0; i < oylar.length; i++) {
                              System.out.println(partiler[i]+ " : " + oylar[i]);
                          }
                      }
                        }
    run
A partisi 75 oy almıştır.
B partisi 91 oy almıştır.
C partisi 66 oy almıştır.
D partisi 73 oy almıştır.
E partisi 89 oy almıştır.
------------------------------------
A Partisi 19.0 yüzdesinde oy almıştır.
B Partisi 23.0 yüzdesinde oy almıştır.
C Partisi 16.0 yüzdesinde oy almıştır.
D Partisi 18.0 yüzdesinde oy almıştır.
E Partisi 22.0 yüzdesinde oy almıştır.
------------------------------------
E : 89
A : 75
B : 91
C : 66
D : 73
    
    
    // çapraz şekilde toplama :( 1,5,9)
                          int[][] dizi= {
                          {1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}
                      };
                              int sayı1=dizi[0][0];
                          int sayı2=dizi[1][1];
                          int sayı3=dizi[2][2];
                          int top = sayı1+ sayı2 + sayı3 ;
                          System.out.println(top);
    
                      /  2. yol
                           int toplam=0;
                          for (int i = 0; i < dizi.length; i++) {
                              toplam+=dizi[i][i];
    
    
    
    // satırları toplama 
    
                              int[] satirtop=new int[dizi.length];
                          for (int i = 0; i < dizi.length; i++) {
                              for (int j = 0; j < dizi[i].length; j++) {
                                  satirtop[j]+=dizi[j][i];
                              }
                          }
                          System.out.println(satirtop);
                          
                          
                          for (int i = 0; i < dizi.length; i++) {
                              
                              Yarım kaldı devam et.
    
    
    
    // satırdaki en büyük sayı
    
                              int[][] dizi= {
                          {1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}
                      };
                          for (int i = 0; i < dizi.length; i++) {
                        int eb=dizi[i][0];
                              for (int j = 0; j < dizi[i].length; j++) {
       
                              if (eb< dizi[i][j]) {
                                  eb=dizi[i][j];
                              }
                              }
                                System.out.println(eb);
                          }
run:
3
6
9
    
    
    
    // sütundaki en büyük sayılar
                              int[][] dizi= {
                          {1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}
                      };
                          for (int i = 0; i < dizi.length; i++) {
                        int eb=dizi[0][i];
                              for (int j = 0; j < dizi[i].length; j++) {
       
                              if (eb< dizi[j][i]) {
                                  eb=dizi[j][i];
                              }
                              }
                                System.out.println(eb);
                          }
    run
    7   8   9  
    
    
    
    // köşeler toplami
                              int[][] dizi= {
                          {1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}
                      };
                          int n = dizi[0].length -1;  //son satır
                          int m = dizi.length -1; // ilk satır
                          int top =
                          dizi[0][0] +  dizi[0][n] + dizi[m][0] + dizi[m][n] ;
  
                          System.out.println(top);
    
    run = ( 1+3+7+9)=20
    
    
    
    
    
    
    */

    
                      public static void main(String[] args) {
                          
       
                          }
}

                          
                      
                      
                                