
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// ali.txt de ki en büyük ve en küçük sayı
public class main{
    public static void main(String[] args) throws IOException {
        File f= new File("ali.txt");
        FileWriter fw= new FileWriter(f);
        Scanner s= new Scanner(f);
        int eb=0; int ek=1000;
        while (s.hasNext()) {
            int sayı=s.nextInt();
            if (sayı>eb) {
                eb=sayı;
            } else if (sayı<ek) {
                ek=sayı;
            }
        }
        fw.close();
      int[] sayı={ek,eb};
        System.out.println(Arrays.toString(sayı));
    }
}




//İlk harfi a olanlar

public class CC{
    
    public static String[] ilkharf(String [][] a){
        String[] array = new String[a.length];
        int indis=0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j].charAt(0)=='A') {
                        System.out.println(a[i][j]);
                        array[indis]+=a[i][j];
                        indis++;
                    }
                }
            }
            return array ;
}
    public static void main(String[] args) {
        String [][] dizi= {{"Ali","selam","eşşek"},{"Aslı","Sülman","Araba"}};
        System.out.println(Arrays.toString(ilkharf(dizi)));
    }
    }




// polidrom

   public static boolean isPalindrom(String str){

        int i=0;
        int j=str.length()-1;
        while(i<j){
         if(str.charAt(i) != str.charAt(j)) {
             return false;
         }
          i++;
          j--;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
          Scanner k=new Scanner(System.in);
         File f= new File("Polidrom.txt");
        System.out.println("Kelime gir");
       PrintWriter fw=new PrintWriter(f);
       int sayac=0;
        for (int i = 0; i < 4; i++) {
            String str=k.nextLine();
           if ( isPalindrom(str)==true) {
             fw.println(str);  
               sayac++;
        }
           else{
           }
        }
                    System.out.println(sayac);
       fw.close();
         }
    }



//Örnek: Bir çiftlikte tavuk, inek ve koyunların olduğu biliniyor. Hayvanların ayak sayıları toplamı 24 olduğuna göre hayvan sayılarını tahmin eden metodu yazınız?


  public static void  tahmin(int sayi){
        for (int i = 1; i < sayi; i++) {
            for (int j = 1; j < sayi; j++) {
                for (int k = 1; k < sayi; k++) {
                    if(2*i+4*j+4*k==sayi)
                        System.out.println(i+","+j+","+k);
                }
            }
        }
     
    }
    public static void main(String[] args) {
        tahmin(24);
    }
    }
*/



public class Main {
   public static void main(String[] args) {
        // Örnek giriş matrisi
        int[][] matris = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // İki kat küçültme işlemi
        int[][] kucukMatris = ikiKatKucult(matris);

        System.out.println(Arrays.deepToString(kucukMatris));
    }

    public static int[][] ikiKatKucult(int[][] matris) {
        int satirUzunlugu = matris.length;
        int sutunUzunlugu = matris[0].length;

        // Yeni matrisin boyutunu belirleme (bir öncekinden iki kat küçük)
        int yeniSatirUzunlugu = satirUzunlugu / 2;
        int yeniSutunUzunlugu = sutunUzunlugu / 2;

        // Yeni matris oluşturma
        int[][] yeniMatris = new int[yeniSatirUzunlugu][yeniSutunUzunlugu];

        // Yeni matrisi doldurma
        for (int i = 0; i < yeniSatirUzunlugu; i++) {
            for (int j = 0; j < yeniSutunUzunlugu; j++) {
                // Her bir 2x2 bloğun ortalama değerini al
                int ortalama = (matris[2*i][2*j] + matris[2*i][2*j+1] + matris[2*i+1][2*j] + matris[2*i+1][2*j+1]) / 4;
                yeniMatris[i][j] = ortalama;
            }
        }

        return yeniMatris;
    }
}