
package Birincidonemders;

import java.util.Random;


public class ders8 {

    /*
    // Birim matrix
    
                                  int[][] dizi=new int [5][5];
                              for (int i = 0; i <dizi.length ; i++) {
                                  for (int j = 0; j < dizi[i].length; j++) {
                                          if (i==j) 
                              dizi[i][j]=1;
                           else 
                                dizi[i][j]=0;                
                                   System.out.print(dizi[i][j]+" ");
                          }
                              System.out.println(" ");
                          }    
    run 
1 0 0 0 0  
0 1 0 0 0  
0 0 1 0 0  
0 0 0 1 0  
0 0 0 0 1  
    
    
    // Diziden 0 ları silmek 
                         int[][] dizi={{1,2,3,2,1}, {1,2,0,2,1}, {1,0,0,0,1},{1,2,0,2,1}, {1,2,3,2,1},
                       };
                                                 for (int i = 0; i < dizi.length; i++) {
                              for (int j = 0; j < dizi[i].length; j++) {
                                  System.out.print(dizi[i][j]+" ");
                              }
                              System.out.println(" ");
                          }
                                                 
                                                 System.out.println("--------------------------------");
                                                 System.out.println("Sıfırları silersek;");
                                                 
                          for (int i = 0; i < dizi.length; i++) {
                              for (int j = 0; j < dizi[i].length; j++) {
                                  if (dizi[i][j]!=0) 
                                      System.out.print(dizi[i][j]+" ");
                                 else 
                                      System.out.print("  ");
                              }
                              System.out.println("  ");
                          }
    
    run:
1 2 3 2 1  
1 2 0 2 1  
1 0 0 0 1  
1 2 0 2 1  
1 2 3 2 1  
--------------------------------
Sıfırları silersek;
1 2 3 2 1   
1 2    2 1   
1          1   
1 2    2 1   
1 2 3 2 1  
    
    
    
    // Cevap anahtarından kaç doğru olduğuna bakma
    
                          char[] cevapAnahtarı= {'B','C','A','E','D','A','B','B','C','E'};
                          char[][] ogrenciCevap={
                              {'A','C','E','D','E','A','B','D','E'},
                              {'B','A','C','D','A','B','C','C','E'},
                              {'C','B','A','E','E','B','B','D','E'},
                              {'D','B','E','A','A','B','B','C','E'},
                              {'E','E','B','C','B','A','B','C','E'},
                          };
                          for (int i = 0; i < ogrenciCevap.length; i++) {
                               int sayac=0;  // her öğrencinin sayısını ayrı ayrı hesaplamak için for döngüsünün içine yazdık.
                              for (int j = 0; j < ogrenciCevap[i].length; j++) {
                                  if (ogrenciCevap[i][j]==cevapAnahtarı[j]) 
                                      sayac++;
                                  }
                              System.out.println(i+". öğrencinin doğru sayısı = "+sayac);
                              }
    
    run:
0. öğrencinin doğru sayısı = 3
1. öğrencinin doğru sayısı = 1
2. öğrencinin doğru sayısı = 3
3. öğrencinin doğru sayısı = 1
4. öğrencinin doğru sayısı = 2
    
    
    
    
    //
    
                              int[][] a=new int[3][4];
                          int[][] b= new int[3][4];
                          Random r=new Random();
                   
                          for (int i = 0; i < b.length; i++) {
                              for (int j = 0; j < b[i].length; j++) {
                                  a[][]= r.nextInt(10) ;
                                  b[][]= r.nextInt(10) ;
                                          
                                      }
                                  }
                                  int satır = dizi.length;
                                  int sutun= dizi[0].length;
                                  int [] [] sonuc = new int [satır][sutun];
                                  for (int i = 0; i < satır; i++) {
                                      for (int j = 0; j < sutun; j++) {
                                          sonuc[i][j] = a[i][j]+ b[i][j];
                                          
                                      }
                          }
                                  YARIM KALDI TAMAMLA
    
                              }
                          }
 
    
    
    // asallık bulma tek kullanımlık kod;
    
                              int sayi= 52;
                          boolean asalMi = true ;
                          for (int i = 2; i < sayi; i++) {
                              if (sayi%i ==0) {
                                  asalMi=false;
                              }
                          }
                                  if (asalMi) {
                                      System.out.println("Asal");
                          }else{
                                      System.out.println("Asal değil");
                                  }
    
    
    
    // Asal mı ? Tekrar kullanılabilir kod
    
    
                              if (asalMi(7)) 
                              System.out.println("Asal");
                                  if (asalMi(15)) 
                              System.out.println("Asal");
                      }
    
                                  public static boolean asalMi(int sayi) {
                                      boolean a = true;
                                      for (int i = 2; i < sayi; i++) {
                                          if (sayi%i==0) 
                                              a=false;
                                          
                                      }
                                      return a ;
    
    */
                      public static void main(String[] args) {
                          int a = 5 , b = 3 ;
                          yerDegis(a,b);
                          System.out.println(a+", "+b);
                      }
                                  public static void yerDegis( int x, int y) {
                                 int temp =x;
                                 x=y;
                                 y=temp;
                                      }
                          
                                  }
                          

