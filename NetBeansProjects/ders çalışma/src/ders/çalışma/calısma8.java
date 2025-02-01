/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ders.çalışma;

import java.util.Arrays;

/*
// Sütun toplamı

        int[][] matris= {
            {1,2,3,4,5},
            {3,4,5,6,7},            
        };

        for (int j = 0; j < matris[0].length; j++) {
            int top = 0;
            for (int i = 0; i < matris.length; i++)
                top += matris[i][j];
            System.out.println( j + " Sütun toplamı: " + top);
        }




//satır toplamı

        int[][] matris= {
            {1,2,3,4,5},
            {3,4,5,6,7},            
        };

        for (int i = 0; i < matris.length; i++) {
            int top = 0;
            for (int j = 0; j < matris[i].length; j++)
                top += matris[i][j];
            System.out.println( i+ "  satır toplamı: " + top);
}




// diziyi rastgele karıştırıp yazma

        int[][] matris= {
            {1,2,3,4,5},
            {3,4,5,6,7},            
        };
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                int i1 = (int)(Math.random() * matris.length);          
                int j1 = (int)(Math.random() * matris[i].length);
                int temp = matris[i][j];
                matris[i][j] = matris[i1][j1]; 
                matris[i1][j1] = temp;
                System.out.print(matris[i1][j1]);
}
}


//Dizideki sayıların toplamı ve ortalaması

 int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};    //array=dizi
 double sum=0;      //sum=sayı
 for (int i = 0; i < my_array.length; i++)
 sum = sum+ my_array[i];
 System.out.println("Dizideki elemanlar toplamı: "+sum);
 double average = sum / my_array.length;   //average=ortalama
 System.out.println("Dizi sayılarının otralaması: " + average);
 



// Verilen sayı dizide var mı ?
         int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
         int finder = 56;     //56 sayısını arıyoruz
         int flag = -1, index=-1;      // Verilen sayı varsa flag değeri değişiyor ve index değeriyle kaçıncı sırada olduğunu görüyoruz.

         for (int i = 0; i < my_array.length - 1; i++)
             if (my_array[i] == finder) {
                 flag = 1;
                 index = i;
                 break;
 }
         if (flag == -1)
             System.out.println(finder + "  sayısı dizide yoktur");
         else
             System.out.println(finder + "  sayısı dizide vardır ve  "+index+". indextedir.");





// Dizideki max ve min değeri bulma

 int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
 int max = my_array[0];
 int min = my_array[0];
 int len = my_array.length;
 for (int i = 1; i < len - 1; i++) {
 if (my_array[i] > max) 
 max = my_array[i];
 if (my_array[i] < min) 
 min = my_array[i];
 }
 System.out.println("Dizideki Maximum değer = " + max);
 System.out.println("Dizideki minimum değer = " + min);



// seçilen yeni sayıyı dizide seçeceğimiz indise yazma

         int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

         int Index_position = 2;     //Yeni sayının yazılacağı index
         int newValue = 5;              // Yazılan yeni sayı

         System.out.println("Original Array : " + Arrays.toString(my_array));  //orjinal dizi

         for (int i = my_array.length - 1; i > Index_position; i--) {
             my_array[i] = my_array[i - 1];
 }
         my_array[Index_position] = newValue;
         System.out.println("New Array      : " + Arrays.toString(my_array));

run
Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]   
New Array      : [25, 14, 5, 56, 15, 36, 56, 77, 18, 29]      // son sayıyı silip 2. indexe 5i yazıp 1 kaydırdı.




// Dizide tekrar eden sayılar
         int[] my_array = {1, 2, 5, 5, 6, 6, 6, 7, 2};
 for (int i = 0; i < my_array.length - 1; i++) {
 for (int j = i; j < my_array.length; j++) {
 if ((my_array[i] == my_array[j]) && (i != j))
 System.out.println("Duplicate Element : " + my_array[j]);
 }
 }




//  a sayısından b sayısına kadar olan sayıların toplamı kısa yol
  public static int toplam(int a, int b) {
int top = 0;
for (int i = a; i <= b; i++)
top += i;
return top;
}
    public static void main (String[] args){ 
System.out.println("1-10 aralık toplamı: " +toplam(1, 10));
System.out.println("20-30 aralık toplamı: "+ toplam(20, 30));
System.out.println("35-45 aralık toplamı:"+ toplam(35, 45));
 }



// 2 sayı arasından büyük olanı bulma

public static int max(int num1, int num2) {
 int result;
 if (num1 > num2)
 result = num1;
 else
 result = num2;
 return result;
}
    public static void main (String[] args){ 
 int i = 5;
 int j = 2;
 int k = max(i, j);
 
 System.out.println( i +" ve "+ j + " arasında büyük olan  " + k + " 'tir.");




// Sayının tek çift ve negatif olduğunu bulma

public static int sign(int n) {
 if (n > 0) 
 return 1;
 else if (n == 0) 
 return 0;
 else 
 return -1;
} 
    public static void main (String[] args){ 
        System.out.println(sign(5));               
                System.out.println(sign(0));
                        System.out.println(sign(-8));
                                System.out.println(sign(92));
                                        System.out.println(sign(-620));
    }




// Alınan notun hangi harfe karşılık geldiğini bulma

public static void main(String[] args) {
System.out.print("The grade is ");
printGrade(78.5);
System.out.print("The grade is ");
printGrade(59.5);
}
public static void printGrade(double score) {
if (score >= 90.0) System.out.println('A');
else if (score >= 80.0) System.out.println('B');
else if (score >= 70.0) System.out.println('C');
else if (score >= 60.0) System.out.println('D');
else if (score <= 60.0) System.out.println('F');
}



// Bir kelime veya cümleyi n kadar yazdırma

public static void main(String[] args) {
    nPrintln("Welcome to Java", 5);     // Cümleyi 5 kere yazdırır.
    nPrintln("Compuser Scince", 15);    // Cümleyi 15 kere yazdırır.
}

public static void nPrintln(String message, int n) { 
for (int i = 0; i < n; i++)
System.out.println(message);
}




    // TRİGONOMETRİK METOTLAR

      Math.sin(a);     
     Math.asin(a); 
     Math.cos(a); 
     Math.sin(Math.PI / 6)

    System.out.println(Math.sin(0));    // run 0.0;
    System.out.println(Math.sin(Math.PI / 6));    // run 0.5;     pi/6 = 180/6 = 45      (sin45)
    
    

    // ÜSTEL METOTLAR
    
    exp(double a)       e üssü a (e^a) değeridir    
    log(double a)              a değerinin doğal logaritması.
    log10(double a)             a‘nın 10-tabanında logaritmasıdır.
    pow(double a, double b)        a üssü b (a^b) değeridir
    sqrt(double a)              a değerinin karekökünü hesaplar.

    
    System.out.println(Math.exp(1));      // run = 2,71      e üzeri 1 in değeridir
     System.out.println(Math.log(2.71));      // run = 1.0      ln1 in değeri
      System.out.println(Math.log10(10));      // run = 1.0    log 10 tabanında 10 demek
       System.out.println(Math.pow(2,3));      // run = 8.0      2 nin küpü
        System.out.println(Math.sqrt(4));      // run = 2.0          4 ün karekökü
        
        

        //YUVARLAMA METODU
        
        double ceil(double x)            x en yakın büyük tam sayıya yuvarlanır. Bu tam sayı double olarak döndürülür.
        double floor(double x)         x en yakın küçük tam sayıya yuvarlanır. Bu değer double olarak döndürülür.
        double rint(double x)           x en yakın tamsayıya yuvarlanır. Eğer x iki tamsayıya yakın olarak eşit ise çift olan döndürülür.
        int round(float x)                   Return (int)Math.floor(x+0.5).
        long round(double x)           Return (long)Math.floor(x+0.5).
        
     System.out.println(Math.ceil(2.1));    // run=3.0
     System.out.println(Math.ceil(-2.1));     // run=-2.0
     System.out.println(Math.floor(2.1));   // run = 2.0
     System.out.println(Math.floor(-2.1));    //run = -3.0
     System.out.println(Math.rint(2.1));    // run = 2.0   
     System.out.println(Math.rint(-2.1));     // run = 2.0
     System.out.println(Math.rint(2.5));    // run = 2.0
     System.out.println(Math.round(2.6f));      // run = 3
     System.out.println(Math.round(2.0f));      // run = 2
     System.out.println(Math.round(-2.6f));      // run = -3 
     
     
     // min max abs metotlar
    
      max(a, b)and min(a, b)       İki değerden maksimum veya minimumu döndürür. 
      abs(a)                        Parametrenin mutlak değerini döndürür. 
      random()                   [0.0, 1.0) aralığında double bir değer döndürür. 
       a + Math.random() * b     [a, a+b) aralığında double bir değer döndürür.
     
     System.out.println(Math.max(5, 3));      // run =5
     System.out.println(Math.min(5, 3));      // run =3
     System.out.println(Math.abs(-7));      // run = 7 
     System.out.println(Math.random());      // run 0 ve 1 arası rastgele sayı üretir
     System.out.println(Math.random()*10);      // run 0 ve 10 arası rastgele sayı üretir
     System.out.println(50+Math.random()*50);      // run 50 ve 99 arası rastgele sayı üretir
}
*/


public class calısma8 {
    
public static void main ( String[] args){
    // TRİGONOMETRİK METOTLAR
  /*     Math.sin(a);     
     Math.asin(a); 
     Math.cos(a); 
     Math.sin(Math.PI / 6)
    */
    System.out.println(Math.sin(0));    // run 0.0;
    System.out.println(Math.sin(Math.PI / 6));    // run 0.5;     pi/6 = 180/6 = 45      (sin45)
    
    
    // ÜSTEL METOTLAR
    /*
    exp(double a)       e üssü a (e^a) değeridir    
    log(double a)              a değerinin doğal logaritması.
    log10(double a)             a‘nın 10-tabanında logaritmasıdır.
    pow(double a, double b)        a üssü b (a^b) değeridir
    sqrt(double a)              a değerinin karekökünü hesaplar.
*/
    
    System.out.println(Math.exp(1));      // run = 2,71      e üzeri 1 in değeridir
     System.out.println(Math.log(2.71));      // run = 1.0      ln1 in değeri
      System.out.println(Math.log10(10));      // run = 1.0    log 10 tabanında 10 demek
       System.out.println(Math.pow(2,3));      // run = 8.0      2 nin küpü
        System.out.println(Math.sqrt(4));      // run = 2.0          4 ün karekökü
        
        
        //YUVARLAMA METODU
        /*
        double ceil(double x)            x en yakın büyük tam sayıya yuvarlanır. Bu tam sayı double olarak döndürülür.
        double floor(double x)         x en yakın küçük tam sayıya yuvarlanır. Bu değer double olarak döndürülür.
        double rint(double x)           x en yakın tamsayıya yuvarlanır. Eğer x iki tamsayıya yakın olarak eşit ise çift olan döndürülür.
        int round(float x)                   Return (int)Math.floor(x+0.5).
        long round(double x)           Return (long)Math.floor(x+0.5).
        */
     System.out.println(Math.ceil(2.1));    // run=3.0
     System.out.println(Math.ceil(-2.1));     // run=-2.0
     System.out.println(Math.floor(2.1));   // run = 2.0
     System.out.println(Math.floor(-2.1));    //run = -3.0
     System.out.println(Math.rint(2.1));    // run = 2.0   
     System.out.println(Math.rint(-2.1));     // run = 2.0
     System.out.println(Math.rint(2.5));    // run = 2.0
     System.out.println(Math.round(2.6f));      // run = 3
     System.out.println(Math.round(2.0f));      // run = 2
     System.out.println(Math.round(-2.6f));      // run = -3 
     
     
     // min max abs metotlar
     /*
      max(a, b)and min(a, b)       İki değerden maksimum veya minimumu döndürür. 
      abs(a)                        Parametrenin mutlak değerini döndürür. 
      random()                   [0.0, 1.0) aralığında double bir değer döndürür. 
       a + Math.random() * b     [a, a+b) aralığında double bir değer döndürür.
     */
     System.out.println(Math.max(5, 3));      // run =5
     System.out.println(Math.min(5, 3));      // run =3
     System.out.println(Math.abs(-7));      // run = 7 
     System.out.println(Math.random());      // run 0 ve 1 arası rastgele sayı üretir
     System.out.println(Math.random()*10);      // run 0 ve 10 arası rastgele sayı üretir
     System.out.println(50+Math.random()*50);      // run 50 ve 99 arası rastgele sayı üretir
}


    }
   
    
    



