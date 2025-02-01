/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ders.çalışma;

/*
// not en yüksek nottan 10 eksikse A , 20 eksikse B , 30 eksikse C , 40 eksikse D, diğer durumlarda da F aldığını gösteren program  
                    
                          Scanner klavye = new Scanner(System.in);
                          System.out.print("Öğrenci sayısını gir =");
                          int ogrencisayisi= klavye.nextInt();
                          int[] notlar = new int[ogrencisayisi];
                          int eniyi=0;
                          for (int i = 0; i < notlar.length; i++) {
                              System.out.println((i+1)+" . öğrenci notu: ");
                              notlar[i] = klavye.nextInt();
                              if (notlar[i]>eniyi) {
                                  eniyi= notlar[i];
                             }
                              
                          }
                          for (int i = 0; i < notlar.length; i++) {
                              if (notlar[i]>= eniyi-10) {
                                  System.out.println("öğrenci "+i+" notu : "+notlar[i]+" harf notu: A");
                              } else if (notlar[i]>= eniyi-20) {
                                  System.out.println("öğrenci "+i+" notu : "+notlar[i]+" harf notu: B");
                              }else if (notlar[i]>= eniyi-30) {
                                  System.out.println("öğrenci "+i+" notu : "+notlar[i]+" harf notu: C");
                              } else if (notlar[i]>= eniyi-40) {
                                  System.out.println("öğrenci "+i+" notu : "+notlar[i]+" harf notu: D");                                   
                              } else {
                                  System.out.println("öğrenci "+i+" notu : "+notlar[i]+" harf notu: F");                            
                              }
                          }
   
    // diziyi ters çevirme

                          int [] dizi = new  int [10];
                          for (int i = 0; i < dizi.length; i++) {
                              dizi[i]=(int)(Math.random()*100);
                          }
                              System.out.println("Orjinal dizi:");                          
                              for (int eleman : dizi) {
                                  System.out.print(eleman+" ");                              
                              }
                              System.out.println(" ");
                              
                              for (int i = 0, j=dizi.length-1; i < j ; j--, i++) {
                              int ara = dizi[i];
                              dizi[i]=dizi[j];
                              dizi [j]=ara;
                          }
                              System.out.println("Ters çevirilmiş dizi;");
                              for (int eleman : dizi) {
                                  System.out.print(eleman +" ");
                              }

run:
Orjinal dizi:
62 68 72 86 60 59 27 44 61 41  
Ters çevirilmiş dizi;
41 61 44 27 59 60 86 72 68 62 


//  Birbirinden farklı 10 elemanlı dizi oluşturma

                          int[] dizi = new int[10];
                          Scanner klavye= new Scanner(System.in);
                          int i =0;
                          while (i<10) {                              
                              System.out.print((1+i) +" . eleman= ");
                              int x = klavye.nextInt();
                              boolean b= false;
                              for (int j = 0; j < i; j++) {
                                  if (x== dizi[j]) {
                                      b=true;
                                      break;
                                  }
                              }
                              if (b)  continue;
                              else{      dizi[i]=i; i++;       }
                          }
                              for (int eleman : dizi) 
                                  System.out.print(eleman+" ");
                              
run:
1 . eleman= 1
2 . eleman= 2
3 . eleman= 3
4 . eleman= 4
5 . eleman= 5
6 . eleman= 6
7 . eleman= 7
8 . eleman= 8
9 . eleman= 9
10 . eleman= 10
0 1 2 3 4 5 6 7 8 9



//Sayıları Küçükten büyüğe sıralama 
 
                          int [] dizi = new int [10];
                          for (int i = 0; i < dizi.length; i++) 
                              dizi [i] = (int)( Math.random()*100);
                              for (int eleman : dizi) 
                                  System.out.print(eleman+" ");
                                  System.out.println();
                              
                              boolean a= true;
                              do {                              
                               a=false;
                                  for (int i = 0; i < dizi.length-1; i++) {
                                      if (dizi[i]>dizi[i+1]) {
                                          int ara =dizi[i];
                                          dizi[i]=dizi[i+1];
                                          dizi[i+1]=ara;
                                          a=true;
                                      }
                                  }
                          } while (a);
                              for (int eleman : dizi) {
                                  System.out.print(eleman+" ");
                          }

run:
27 62 93 34 39 84 89 15 18 98 
15 18 27 34 39 62 84 89 93 98




// Programınız girilen tek ve çift sayıların ortalamasını ayrı bulan programı yazınız?

                          int[] dizi= new int[5];
                          Scanner klavye =new Scanner(System.in);
                          System.out.println("Dizi elemanlarını gir = ");
                                  int tektop=0 , cifttop=0, teksay=0;
                                  for (int i = 0; i < dizi.length; i++) {
                              dizi[i]=klavye.nextInt();
                                      if ((dizi[i]%2)==0) 
                                          cifttop+=dizi[i];
                                      else {
                                          tektop+=dizi[i];
                                          teksay++;
                                      }
}
                           double tekort= (double) tektop/teksay;
                           double ciftort= (double) cifttop/(5-teksay);
                          System.out.println("Çift ortalaması =" + ciftort);
                          System.out.println("Tek ortalaması =" + tekort );

*/
public class calısma7 {
    


    
}
