package ders.çalışma;

import java.util.Arrays;
import java.util.Scanner;

public class calısma9 {

    /*
    // 1- Klavyeden girilen ve kendilerine parametre olarak gelen bu sayının çift basamaklarını ve tek 
basamaklarını toplayarak ekrana yazan java metotlarını yazınız? 
           
         Scanner in = new Scanner(System.in);
         System.out.print("Sayi giriniz:");
         int n = in.nextInt();
         System.out.print("Cift basamakların toplami: ");
         System.out.println(cifttopla(n));
         System.out.print("Tek basamakların toplami: ");
         System.out.println(tektopla(n));
 }

    public static int cifttopla(int n) {

        int cifttoplam = 0;
         while (n > 0) {
             int digit = n % 10; 
             if (digit % 2 == 0)
             cifttoplam += digit;
             n /= 10;
         }
         return (cifttoplam);
    }
    
 public static int tektopla(int n) {
         int tektoplam = 0;
         while (n > 0) {
             int digit = n % 10; 
              if (digit % 2 != 0)
               tektoplam += digit;
               n /= 10;
         }
         return (tektoplam);
 }
    
    
    // başında veya sonunda 6 varsa true yoksa false
    
    public static void main ( String[] args){
  int[] nums={1,2,3,4,5,6};
    boolean x=true;
  for (int i=0; i>nums.length; i++){
  if (nums[0]==6 || nums [nums.length-1] == 6)
  x = true ;
  else 
  x = false;
  }
    System.out.println(x);
    
    
    
    //başında veya sonunda 6 varsa true yoksa false (metotlarla)
    
          public static void main ( String[] args){
  int[] dizi={6,2,3,4,5,6};
    System.out.println(dizi(dizi));
}
      
      public static boolean dizi(int[] nums) {
          boolean x= false;
           for (int i=0; i<nums.length; i++){
          if (nums[0]==6 || nums [nums.length-1] == 6)
              x = true ;
          else 
              x = false;
  }
           return x;
    }
    
    
    
    //Bir int dizisi verildiğinde, dizinin uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse true değerini döndürün.

    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6};
        System.out.println(dizi(dizi));
        int[] dizia = {6, 2, 3, 4, 5, 6};
        System.out.println(dizi(dizia));
    }

    public static boolean dizi(int[] nums) {
        boolean x = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
                x = true;
            } else {
                x = false;
            }
        }
        return x;
    }
    
    
    
    
// 2 ints dizisi (a ve b) verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye sahiplerse true değerini döndürün. Her iki dizi de uzunluk 1 veya daha fazla olacaktır.
    
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6} ;
        int[] dizia ={2, 2, 3, 4, 5, 6};
        System.out.println(ortakIndis(dizia, dizi));
        
        int[] dizib = {1, 2, 3, 4, 5, 6} ;
        int[] dizic ={14, 7, 9, 3, 5,};
        System.out.println(ortakIndis(dizib, dizic));
    }
    
    public static boolean ortakIndis(int[] a, int[] b) { 
        boolean x = false;
                if (a[0]==b[0] || a[a.length-1]==b[b.length-1]) {
                    x=true;
                } else {
                    x=false;
                }
return  x ;
}

    
        // Dizi içindeki sayıların toplamı;
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6} ;
        int[] dizia ={4,7,3};
        System.out.println(toplam(dizi));  // run = 21
        System.out.println(toplam(dizia));   // run = 14
    }
    public static int toplam(int [] number) { 
       int top=0;
        for (int i = 0; i < number.length; i++) {
            top+=number[i];
        }
return  top ;
}
    
    
    
        // diziyi tersne döndür;
    
        public static void main(String[] args) {
        int[] dizi ={4,7,3};
        System.out.println(Arrays.toString(dizi(dizi))); 
    }
    public static int[] dizi(int [] number) { 
        int[] array= new int[number.length];
        for (int i = 0; i < number.length; i++) {
            array[i]= number[number.length-1-i];
        }
        return array;
}
    
    
    
    
       //dizideki tüm sayıları dizinin en büyük elemanına çevir;
    public static void main(String[] args) {
        int[] dizi ={3,4,7,3,6};
        System.out.println(Arrays.toString(ebdizi(dizi))); 
    }
    
    public static int[] ebdizi(int [] dizi) { 
        int eb = 0;
        for (int i = 0; i < dizi.length; i++) {
             if (dizi[i]>eb) {
                 eb=dizi[i];
             }
        }
             for (int j = 0; j < dizi.length; j++) {
                dizi[j]=eb;
            }
        return dizi;
    }
    
    
    
    
     //Bir dizi int verildiğinde, dizideki ilk 2 öğenin toplamını döndürün. Dizi uzunluğu 2'den küçükse, mevcut öğeleri toplayın; dizinin uzunluğu 0 ise 0 değerini döndürün.

    public static void main(String[] args) {
        int[] dizi ={3,4,7,3,6};
         System.out.println(Arrays.toString(ebdizi(dizi)));
        int[]dizia= {2};
         System.out.println(Arrays.toString(ebdizi(dizia)));
        int[]dizic= {};
       System.out.println(Arrays.toString(ebdizi(dizic)));
    }
    
    public static int[] ebdizi(int [] dizi) { 
        int toplam=0;
            if (dizi.length>=2) {
            toplam=dizi[0]+dizi[1];
            }else if (dizi.length==1) {
                toplam=dizi[0];
            } else {
                toplam=0;
            }
            System.out.println(toplam);
        return dizi;
    }
    
    
    
    
    
        //Her birinin uzunluğu 3 olan 2 int dizi (a ve b) verildiğinde, orta elemanlarını içeren yeni bir dizi uzunluğu (2) döndürür.
   //ortaYol([1, 2, 3], [4, 5, 6]) → [2, 5]
    public static void main(String[] args) {
        int[] dizi={1,2,3};
        int[] dizi2={3,4,5};
        System.out.println(Arrays.toString(ortadizi(dizi, dizi2)));
    }
    
    public static int[] ortadizi(int [] dizi ,  int[] dizi2) { 
        int[] yenidizi= new int[2];
        yenidizi[0]=dizi[1];
        yenidizi[1]=dizi2[1];
        return yenidizi;
    }
    
    
    
    
    
        //Yeni dizi eski dizinin ilk ve son elemanından oluşmalı  =  makeEnds([1, 2, 3, 4]) → [1, 4]
    public static void main(String[] args) {
        int[] dizi={1,2,3};
        System.out.println(Arrays.toString(yenidizi(dizi)));
    }
    public static int[] yenidizi(int [] dizi) { 
        int[] yenidizi= new int[2];
        yenidizi[0]=dizi[0];
        yenidizi[1]=dizi[dizi.length-1];    
        
        return yenidizi;
    }
    
    
    
    
    
        //Bir int dizisi verildiğinde, son öğesinin orijinal diziyle aynı olduğu ve diğer tüm öğelerin 0 olduğu iki kat uzunluğa sahip yeni bir dizi döndürün
    public static void main(String[] args) {
        int[] dizi={1,2,3};
        System.out.println(Arrays.toString(yenidizi(dizi)));
    }
    public static int[] yenidizi(int [] dizi) { 
        int[] yenidizi= new int[dizi.length*2];
        for (int i = 0; i < yenidizi.length; i++) {
         yenidizi[i]=0;   
        }
        yenidizi[yenidizi.length-1]=dizi[dizi.length-1];
        return yenidizi;
    }
    
    
    
    
        //Bir int dizi uzunluğu 3 verildiğinde, dizide hemen ardından 3 gelen bir 2 varsa, 3 öğesini 0 olarak ayarlayın. Değiştirilen diziyi döndürün.
    
    public static void main(String[] args) {
        int[] dizi={1,2,3};            //run = {1,2,0}
        System.out.println(Arrays.toString(yenidizi(dizi)));
    }
    public static int[] yenidizi(int [] dizi) { 
        int[] yenidizi= new int[3];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]==2 && dizi[i+1]==3) {
                dizi[i+1]=0;
            }
            yenidizi[i]=dizi[i];
        }
        return yenidizi;
    }
    
    
    
    
    
    
    
        //Herhangi bir uzunlukta 2 int dizisi (a ve b) ile başlayın. Dizilerin kaçının ilk elemanı olarak 1'e sahip olduğunu döndürün.
//başlangıç1([1, 2, 3], [1, 3]) → 2
//başlangıç1([7, 2, 3], [1]) → 1
//başlangıç1([1, 2], []) → 1
   
    public static void main(String[] args) {
          int[] dizi={1,2,3,4};
          int[] dizi2={2,3,1};
        System.out.println(kactane1(dizi, dizi2) +" tane ilk eleman 1 dir. ");
    }
    
    public static int kactane1(int [] dizi , int [] dizi2) { 
        int kactane=0;
        if (dizi[0] == 1 && dizi2[0]==1) {
            kactane=2;
        } else if (dizi[0] != 1 && dizi2[0]==1) {
            kactane=1;
        } else if (dizi[0] == 1 && dizi2[0]!=1) {
            kactane=1;
        } else {
            kactane=0;
        }
        return kactane;
    }
    
    
    
    
    
    
    // bir metin iriyoruz ve harfin kaç kere tekrarlandığını buluyoruz.;   run =>  aaabbcccc  = a3b2c4
    
           Scanner klavye = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime= klavye.nextLine();
        int sayac =1;
        for (int i = 0; i < kelime.length()-1; i++) {
                        if (kelime.charAt(i)== kelime.charAt(i+1)) {
                sayac++;
                        }   else {
                            if (sayac>1 ) {
                                System.out.println(kelime.charAt(i)+""+sayac);      
                                sayac=1;
                            } else {
                                System.out.println(kelime.charAt(i));
                }
             }
         }
        System.out.println(kelime. charAt(kelime.length()-1) +""+sayac);
}
    
    
    
    
    
    */
    public static void main(String[] args) {
        
                      String a = "Deneme";
                  String b = "Test";
                  // Deneme tseT yazdır.( Testi ters yazdır)
                  
                  for (int i = b.length()-1; i >= 0; i--) 
                   a=a+ b.charAt(i);
                  System.out.println(a);
 
 
 


    }}

    

        
    
    
   
