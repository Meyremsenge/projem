
package Birincidonemders;
import java.util.Scanner;
public class ders5 {
    /*
  //  cümleyi harf harf yazdırmak
    
                      String cumle = "Bilgisayar mühendisi";
                      for (int i = 0; i < cumle.length(); i++) {
                          System.out.println(cumle.charAt(i));
    
    
 //   cümleyi klavyeden al harf harf yazdır
                          Scanner klavye = new Scanner(System.in);
                      System.out.println("Bir cümle girin");
                      String cumle = klavye.nextLine();
                      for (int i = 0; i < cumle.length(); i++) {
                          System.out.println(cumle.charAt(i));
                      }
    
    
    // son x karakteri ayır
    
                         Scanner klavye = new Scanner(System.in);
                      System.out.println("Bir cümle girin");
                      String cumle = klavye.nextLine();
                      System.out.println("Kaç karakter ayrılsın");
                      int ayır = klavye.nextInt();
                      
                      for (int i = 0; i < cumle.length()-ayır; i++)                   
                          System.out.println(cumle.charAt(i));
                     // System.out.println(cumle.substring(i)); 
                     // System.out.println(cumle.substring(i;i+5));  ( i den i+5 e kadar yaz) // gecersiz kod
    
    }

    
    
  // 1 den n e kadar olan sayıların çarpımı
                      Scanner klavye = new Scanner(System.in);
                      System.out.println(" 1 den kaça kadar sayı çarpılsın ?");
                      int n= klavye.nextInt();
                      int top=1;
                      for (int i = 1; i <= n; i++) {
                        top=top*i;
                          
                          System.out.println("sonuç= "+top);
                      }

    
    
 // kullanıcıdan 2 sayı al bi tane de bölunen sayı al sonra da ilk sayıdan son sayıya kadar bolünen bölenleri topla
          Scanner klavye = new Scanner(System.in);
                      System.out.println("Kullanıcıdan 2 sayı al");
                      int ilk = klavye.nextInt();
                      int son = klavye.nextInt();
                      System.out.println("Kullanıcıdan bu sayıları bölecek sayı al");
                      int bolen = klavye.nextInt();
                      System.out.println("Bölünenler= ");
                      int toplam =0;
                      
                      for (int i =ilk; i <= son; i++) {
                          if (i%bolen==0)
                          {
                              
                              System.out.println(i+"");
                              toplam+=i;
                          }
                      }
                          System.out.println("Toplam="+toplam);
    
    
    
   
      // aralaarında asal mı?  (benim yaptığım)
    
         Scanner klavye = new Scanner(System.in);
                      System.out.println("Kullanıcıdan 2 sayı al");
                      int ilk = klavye.nextInt();
                      int son = klavye.nextInt();
                      for (int i = 2; i <= ilk; i++) {
                          if (ilk%i==0 && son%i==0) {
                              System.out.println("Aralarında asal değil");
                              
                              
                          }else{
                              System.out.println("Aralarında asal");
           }
    
    
    
   // aralaarında asal mı?  (hocanın yaptığı)
    
         Scanner klavye = new Scanner(System.in);
                      System.out.println("Kullanıcıdan 2 sayı al");
                      int ilk = klavye.nextInt();
                      int son = klavye.nextInt();
                      boolean aralarındaAsal=true;
                      System.out.println("ortak bölenler: ");
    
                      for (int i = 2; i <= ilk; i++) {
                          if ((ilk%i==0) && (son%i==0)) {
                              System.out.println(i+ " ");
                              aralarındaAsal = false;
                          }               
                      }                    
    
                      if (aralarındaAsal) {
                         System.out.println("Aralarında asal");
                      } else{
                          System.out.println("Aralarında asal değil");
                          
                      }
           

    
                          Scanner klavye = new Scanner(System.in);
                      System.out.println("Bir x sayısı giriniz");
                      int x= klavye.nextInt();
                      if (x>0) {
                          System.out.println("f(x)=" +(double)(1/(1+x)));
                          System.out.println("g(x)="+(double)(1/(x+(x*x))) );
                          
                      } else {
                          System.out.println("f(x)="+(double)(1/(1+(x*x))));
                          System.out.println("g(x)="+(double)(1/(1+x+(x*x)+(x*x*x))));
                      }
                      
                      

    
    
    // satış miktarı 30 liradan az ise sabit üccret 300 lira ve her ürün başına 50 tl. satış miktarı 30 liradan çok ise sabit ücret 400 lira 
    ilk 30 ürün 50 lira 30 dan sonraki her ürün başına 60 lira alınmaktadır. kodu yazdırın.
    
                           Scanner klavye = new Scanner(System.in);
                      System.out.println("Sattığınz ürün sayısı giriniz");
                      int urun=klavye.nextInt();
                      int sabit =300;
                      int sabit2=400;
                      int gunluk=0;
                      if (urun<30){
                         gunluk=sabit+(urun*50);
                         
                      }else{
                          urun=urun-30;
                          gunluk=sabit2+(30*50)+(urun*60);
                          
                      }
                      System.out.println(gunluk);
                      }
                  


// 2  4  8  10  14  ...  sayılarını toplamını yazdır.  
                      int top1=0;
                      int top2=0;
                      for (int i = 2; i < 300; i=i+6)
                 {
                 top1=top1+i;
                     System.out.println(i);
                 }
                     for (int j = 4; j < 300; j=j+6) {
                         top2=top2+j;
                         System.out.println(j);
                     }
                          System.out.println(top1+top2);
 
    
    / hocanın yaptığı
    
                          int terim =2 , toplam =0;
                      for (int i = 1; i <= 100; i++) {
                          System.out.println(terim);
                          if (i%2==1) 
                              terim= terim+2;
                          
                          else 
                          terim=terim+4;
                      }
                      
                      System.out.println(toplam);
                      }

    
    
  // cumlede il gecen yerler  
                          String cumle = "Bilgisayar bilimleri";
                      String aranan= "il";
                      int indeks=0, sonindeks=0;
                      
                      do {                          
                         indeks =  cumle.indexOf(aranan,sonindeks+1);
                          System.out.println(indeks);
                          sonindeks = indeks;
                      } while (indeks != -1);
                    


         // rakam olmayanları ekrana yazdır
                      String cumle = "BMU111";
                      for (int i = 0; i < cumle.length(); i++) {
                          if (cumle.charAt(i)< '0' || cumle.charAt(i)> '9') {
                              System.out.print(cumle.charAt(i));
                          } 
                              
    */
    
    // 9JK2R-7N7BM-97RJY-QG9MP-W2QMB
            
                  public static void main(String[] args) {

    
                          
                  }
                          
                      }
                      

