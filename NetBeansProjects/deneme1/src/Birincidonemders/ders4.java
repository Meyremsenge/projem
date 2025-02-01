
package Birincidonemders;

import java.util.Scanner;


public class ders4 {
    /*
          int x=10 ,  y=10 , z=0 ;
      char a=65;
      char b=66;
                    if (x==y) {
                        z=-10;
                    } else if (x>z) {
                        a='C';
                    } else if (!(x>z)) {
                        b='D';
                    } else if (b<=a) {
                        a=67;
                    } else if (x!=y) {
                        y=x/2;
                    }
                    System.out.println(x);
                    System.out.println(y);
                    System.out.println(z);
    
    
    // aynı örnek farklı yazım
    
          int x=10 ,  y=10 , z=0 ;
      char a=65, b=66;
                    if (x==y) z=-10;
                    if (x>z)  a='C';
                    if (!(x>z))  b='D';
                    if (b<=a) a=67;
                    if (x!=y)  y=x/2;
                    
                    System.out.printf("x=%d y=%d z=%d\n" ,x,y,z);         /print'in yanına f konur.
                    System.out.printf("a=%c b=%c\n" ,a,b);
   
                    
                    
    / ornek 2
                  int x=1, y=2 , z=3;
                  if (x==y) z=5;
                  if (x>z) y=4 ; z=10;
                  if (x!=z) x=7;
                  if (x==y) y=9;
                  System.out.printf("x=%d y=%d z=%d\n",x,y,z);                   /print'in yanına f konur.
                  System.out.println("x="+x+" y="+y+" z="+z);       // 2.yazım türü                  
                      
    
 // klavyeden karakter al . A,B,C ve 1,2,3 yazdır
    
            char kar;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir karakter girinizz");
        kar =klavye.nextLine().charAt(0);
        switch (kar) {
            case 'A':
            case 'B':
            case 'C':
                 System.out.println("Karakter A/B/C den biridir");
                break;
                            case '1':
             case '2':
             case '3':
                 System.out.println("Karakter 1,2,3 ten biridir");
              break;
            default:
                System.out.println("Bilmiyorum");
        }
    
    
    
    // hangi gün
        Scanner klavye = new Scanner(System.in);
        System.out.println("1-7 arası bir sayı giriniz");
        int day = klavye.nextInt();
        
        
        switch (day) {
            case  1:System.out.println("Pazartesi"); break;
            case  2:System.out.println("SAlı"); break;
            case  3:System.out.println("Çarşamba"); break;
            case  4:System.out.println("perşembe"); break;
            case  5:System.out.println("cuma"); break;
            case  6:System.out.println("Cumartesi"); break;
            case  7:System.out.println("Pazar"); break;

            default:
                System.out.println("Geçersiz sayı girdiniz");
        }
    
    
    // Girilen sayılar toplamı
    
                      Scanner klavye = new Scanner(System.in);
                  System.out.println(" 10 tane sayı giriniz");
                  int sonraki;
                  int sayac=1;
                  int toplam=0;
                  
                  while (sayac<=10) {                      
                      sonraki= klavye.nextInt();
                      toplam=toplam+sonraki;
                      sayac++ ;
                  }
                  System.out.println("Sayılar toplamı="+ toplam);


    // ebob bulma
    public static void main(String[] args) {
Scanner klavye=new Scanner(System.in);
System.out.println("Birinci sayıyı girin");
int sayi1=klavye.nextInt();
int sayi2=klavye.nextInt();
int enbbolen=1,k=2;
while(k<=sayi1 && k<=sayi2){
if(sayi1%k==0 && sayi2%k==0)
enbbolen=k;
k++;
}
System.out.println("En büyük ortak Bölen = " + enbbolen);
    
    
    
    // sıfır sayısı girilene kadar yazlan sayıları topla
    Scanner klavye=new Scanner(System.in);
int top=0;
System.out.println("Sıfırdan farklı sayı girin");
int sayi=klavye.nextInt();
while(sayi!=0){
top=top+sayi;
System.out.println("Sayı girişi: çıkış için 0 girin");
sayi=klavye.nextInt();
}
System.out.println("Toplam = " + top);
}

    
    
    
                      double item = 1; double sum = 0;
                  while (!(item <= 0)) {    // No guarantee item will be 0
                      sum += item;
                      item -= 0.1;

                  }
                  System.out.println(sum);


    
    
    
                      int sayac = 1;
                  int sayi = 5;
                  do //1’den 5’e kadar sayıları bir satırda göster
{
    System.out.print(sayac + " ");
    sayac++;
}
                  while(sayac <= sayi);
    
    
    
    
    
        // 21 e kadar 3 er 3 er arttır
    
                      for (int k = 3; k<=21; k=k+3) {
                      System.out.println(k);
    
    
    
    //100 e kadar olan sayılar
    
    for (int i = 1; i < 100; System.out.println(i++));
for (int i = 0, j = 0; (i + j < 10); i++, j++) {
// döngü gövdesi
}
    
    
    
    
    // 1 den 10 a kadar yazma
    
                    int i=0;
                  for ( ; i < 10;i ++) {
                      System.out.println(i);
                  }
    
    
    // 25 tane  yıldızı alt alta yazdırma
    
                      for (int i = 0; i < 5; i++) {
                      for (int j = 0; j < 5; j++) {
                          System.out.println("*");
    }
    }
    
    
    // 5 tane alt alta 5 yıldızyazdır
    run:
 *****
*****
*****
*****
*****
                                        for (int i = 0; i < 5; i++) {
                      for (int j = 0; j < 5; j++) {
                          System.out.print("*");
                          

                      }
                                        System.out.println("");
                  }


    // 1 1 arttırarak yıldız yazdır
    run:
*
**
***
****
*****
******
*******
********
                      int n=8;              
                  for (int i = 0; i < n; i++) {
                      for (int j = 0; j < i+1; j++) {
                          System.out.print("*");                         
                      }
                                        System.out.println("");
                  }
    
    
    
    // 1 1 azaltarak yıldız yazdır
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
    
    
    
    
    
    
    // çarpım tablosu
    
    run:
ÇARPIM TABLOSU
    1   2   3   4   5   6   7   8   9
--------------------------------------------------
1|   1   2   3   4   5   6   7   8   9
2|   2   4   6   8  10  12  14  16  18
3|   3   6   9  12  15  18  21  24  27
4|   4   8  12  16  20  24  28  32  36
5|   5  10  15  20  25  30  35  40  45
6|   6  12  18  24  30  36  42  48  54
7|   7  14  21  28  35  42  49  56  63
8|   8  16  24  32  40  48  56  64  72
9|   9  18  27  36  45  54  63  72  81
    
                      int i,j;
                  System.out.println("ÇARPIM TABLOSU");
                  System.out.print(" ");
                  for(i=1;i<=9;i++)
                      System.out.printf("%4d", i );
                  System.out.println("\n--------------------------------------------------");
                  for (int k = 1; k < 10; k++) {
                      System.out.print(k+"|");
                      for (int l = 1; l < 10; l++) {
                          System.out.printf("%4d",k*l);
}
                      System.out.println("");
}

              }
}

    
    
    //küçük harfe çevirme
    
                      String x= "HASAN";
                  String y= " ";
                  for (int i = 0; i < x.length(); i++)                 
                  y=y+(char)(x.charAt(i)+32);
                  System.out.println(y);
    
    - forsuz 
    
                      String x= "HASAN";
                  String y= " ";             
                  y=y+(char)(x.charAt(0)+32);
                  System.out.println(y);
                  y+= (char)(x.charAt(1)+32);
                  System.out.println(y);
                   y+= (char)(x.charAt(2)+32);
                  System.out.println(y);
                   y+= (char)(x.charAt(3)+32);
                  System.out.println(y);             
                  y+= (char)(x.charAt(4)+32);
                  System.out.println(y);
    
    
    
    // karışık harflerden küçük yazma
    
                        String x= "HAsaN";
                  String y= " ";          
                  char harf;
                  for (int i = 0; i < x.length(); i++) {
                      harf=x.charAt(i);
                      if (harf>='A' && harf<='Z') {
                            y+= (char)(harf+32);
                          
                      } else {
                          y=y+harf;
                      }
                      System.out.println(y);
                  }
    
    
    
    
    // kelimeyi tersten yazdır
                      String a = "Deneme";
                  String b = "Test";
                  // Deneme tseT yazdır.( Testi ters yazdır)
                  
                  for (int i = b.length()-1; i >= 0; i--) 
                   a=a+ b.charAt(i);
                  System.out.println(a);
                      
    
    */
    
    
    

  
                      
              public static void main(String[] args) {

                  }
              }


