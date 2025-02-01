
package Birincidonemders;

import java.util.Scanner;

/*
 public static boolean polindrom(String str){
        if(str == null || str.isEmpty()){
            return false;
        }
        int i=0;
        int j=str.length()-1;
        while (i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


// üstteki kodun refusic hali;

    public static boolean polindrom(String str){
        if(str.length()<2) { return false; }
             if (str.charAt(0) != str.charAt(str.length()-1)) { return false; }
             else  polindrom(str.substring(1, str.length()-2));
        return true;
    }
    public static void main(String[] args) {
        String isim="anna";
               System.out.println(polindrom(isim));
    }




// dizi eleman toplamı 
    public static int diziToplam(int [] dizi){
        int top =0;
        for (int i = 0; i < dizi.length; i++) {
            top+=dizi[i];
        }
        return top;
    }



// Refucif ile dizi toplam 
    public static int diziToplam(int [] dizi, int i){
        if (dizi==null ||   i<0  || i>= dizi.length ) {return 0; }
        if (i==dizi.length-1) { return dizi[i];  }
        return dizi[i] + diziToplam(dizi, i+1);
    }
    public static void main(String[] args) {
        int[] a= {3,5,7,2};
        System.out.println(diziToplam(a, 0));
    }



// Fibonacci yi refusic ile yazma

    public static int fibo(int i1,int i2, int i3){
        if (i3>100) { return 0;  }
       i3=i1+i2;
        System.out.println(i3);
       return fibo(i2, i3, i3);
}
       public static void main(String[] args) {
           System.out.println(fibo(1, 1, 0));
    }


// Kelimenin tersini alma
    public static String tersal(String kelime){
        if (kelime.isEmpty()) {
            return  kelime;
        }
        return  tersal(kelime.substring(1))+kelime.charAt(0));      
    }
    public static void main(String[] args) {
        String str;
        System.out.println("kelime giriniz");
        Scanner k = new Scanner(System.in);
        str=k.nextLine();
        System.out.println(tersal(str));
    }


// Elemanın kaçıncı indiste olduğunu hem normal method hem de recursif ile bul.
public static int BinarySearch(int arr[], int x){
    int i = 0 , j= arr.length-1;
    while (i<=j) {        
        int m = i + (j-1)/2;
        if (arr[m]==x) {
            return m;
        }
        if (arr[m]<x) {
            i=m+1;
        }else{
            j=m-1;
        }
    }
     return -1;
}

public static int BinarySearchRecursif(int [] arr , int i, int j , int x){
    if (i<=j) {
        int m=i+(j-1)/2;
        if (arr[m]==x) {
            return m;
            
        }
        if (arr[m]>x) {
            return BinarySearchRecursif(arr, i, m-1, x);
        }
        return BinarySearchRecursif(arr, m+1, i, x);
    }
    return -1;
}
    public static void main(String[] args) {
  
        int arr[]= {2,11,16,23,44,55,154,166,587};
        System.out.println("Recursif ile bulma:");
        int sonuc = BinarySearchRecursif(arr, 0, arr.length-1, 23);  //  recursif ile Hangi indiste olduğunu bulma
                if (sonuc==-1) {
                    System.out.println("Dizide eleman yok");
        } else {
                    System.out.println("Dizide eleman "+ sonuc + ". indiste");
        }
     System.out.println("Method ile bulma:");
        int sonuc2 = BinarySearch(arr,  23);  // metod ile Hangi indiste olduğunu bulma
                 if (sonuc2==-1) {
                    System.out.println("Dizide eleman yok");
        } else {
                    System.out.println("Dizide eleman "+ sonuc2 + ". indiste");
        }
    }

*/

public class ikincidonemders2ve3 {

   
}
