
package ders.çalışma;

import java.util.Scanner;

public class donem2calısma1 {
    /*
        // 1 den 10 a kadar refusıc ileyaz.
        public static void sayı(int a){
    if(a>10)  System.exit(0);
        System.out.println(a);
         sayı(++a);
}
    public static void main(String[] args) {
        sayı(1);
    }
    
    
    
    // 1 den 10 a kadar olan sayıların toplamı
    public static int sayı(int a) {
        if (a>=10) return a; 
            return a + sayı(++a) ;
       
    }
    public static void main(String[] args) {
        int toplam= sayı(1);
        System.out.println(toplam);
    }

    // Klavyeden girilen sayı kadar adınızı soyadınınzı yazan metod

public static void yaz(int k){
    if (k<=0) System.exit(1); 
        System.out.println("Meyrem şenge");
        yaz(--k);
}    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayı = k.nextInt();
        yaz(sayı);
    }
    
    
    //Parametre olarak gelen sayısal dizinin ortalaması
public  static double ort(double [] a, int n,double top){
    if (n>=a.length) return (top/(double) a.length) ;
    top+=a[n]; 
    return ort(a, ++n, top);
}
    public static void main(String[] args) {
        double [] dizi = { 5,6,8,3,2,0,5};
        System.out.println(ort(dizi, 0, 0.0));
        double [] dizi2= {3,6,9};
        System.out.println(ort(dizi2, 0, 0));
    }
    
    
    //parametre olarak gelen dizideki en büyk eleman
public static int maxbul(int [] a, int max, int i){
    if (i>=a.length) return max;
    if (max< a[i]) max=a[i];
    return maxbul(a, max, ++i);
}
    public static void main(String[] args) {
        int[] dizi = {1,5,3,7,9,3};
        System.out.println(maxbul(dizi, dizi[0], 0));
    }


// Parametre olarak gelen stringdeki a ların sayısını , kaçıncı indiste olduğunu yaz

public static int bul(String s, int sayac , int i){
    if (i>= s.length()) return sayac;
    if ( s.charAt(i) == 'a') {
        System.out.println(i+". indiste");
        ++sayac;}
    return  bul(s, sayac,++ i);
}
    public static void main(String[] args) {
        String a= "Bilgisayar";
        System.out.println(bul(a, 0, 0));
    }

    
    //Birbiriyle aynı sayıda elemanı olan iki dizide Eşit olan değerleri ve indisleri yaz.
    public static void yaz(int [] a , int [] b , int i) {
        if (i>=a.length) System.exit(1); 
        if (a[i]== b[i]) {
            System.out.println(i+". indis olan " + a[i]+ "sayısı aynıdır");
        }
        yaz(a, b,++ i);
    }    
    public static void main(String[] args) {
        int [] a={1,2,3,4,6};
        int [] b={0,2,7,4,5};
        yaz(a, b, 0);
    }
    
    
    // Kendisine paarametre olarak gelen sringdeki x lerin sayılarını bulup geri döndüren method (giobal tanımlama)
 public static int sayac=0, i=0;
   public static int yaz(String a){
       if (i>= a.length()) {
           return sayac;
       }
       if (a.charAt(i)=='x') {
           sayac++;
       }
       i++;
       return yaz(a);
   }
    public static void main(String[] args) {
        System.out.println(yaz("Alexix"))    ;
    }
    
    
    // Klavyeden girilen Adınızı tersten yazan method
    public static Scanner k;
public static int i=1 ;
 public static void tersyaz(String s){
     if (i>s.length()) {
         System.exit(1);
     }
     System.out.print(s.charAt(s.length()-i));
     i++;
     tersyaz(s);
 }
    public static void main(String[] args) {
        k= new Scanner(System.in);
        String isim= k.nextLine();
        tersyaz(isim);
    }
    
    //Klavyeden girilen pozitif tam sayının tam bölenlerini bulup eklrna yazdıran method
  public static Scanner k;
    public static int i=1;
    public static void tambolen(int a){
        if (i>a/2) {
            System.out.println(a);
            System.exit(1);
            
        }
        if (a%i==0)
            System.out.println(i);
        i++;
        tambolen(a);
    }
    public static void main(String[] args) {
        k=new Scanner(System.in);
        int sayı=k.nextInt();
        tambolen(sayı);
    }
    
    
  //  Yanlış girldiğinde uyaran exceptions kodu örneği
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        try {
            int t = k.nextInt();
            int m = k.nextInt();
            System.out.println(t/m);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
    //odev
          public static int matrix(int [][] s1, int[][] s2, int[][] s3, int i, int j){
            if (i*j>=s1.length) { System.exit(0);
            }
            if (i==0) {
          
            s3[i][j]=s2[i][j]*s1[i][j];
            j++;
        }
            
}
    
    */


  
}
