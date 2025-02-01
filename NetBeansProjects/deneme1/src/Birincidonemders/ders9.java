
package Birincidonemders;

import java.util.Scanner;

/*
// dizi elemanlarını toplama

      public static int diziElemanTopla(int [] dizi) {
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];          
        }
            return toplam;
    }

// Diziyi yazdırma
    public static void diziyazdir(int [] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println(" ");
    }


// Dizi elemanlarını sırala ( olmadı hocaya sor)
    public static int[] diziSiralama(int [] dizi) {
        int ebindis, temp;
        for (int i = 0; i < dizi.length; i++) {
            ebindis=i;
            for (int j = i; j < dizi.length; j++) {
                if (dizi[j]>dizi[ebindis]) {
                    ebindis=j;
                }
                temp=dizi[ebindis];
                dizi[ebindis]=dizi[i];
                dizi[i]=temp;
            }
        }
          return dizi;
    }

// Dizinin üssünü bulma
public static int usal(int sayi , int  us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc*=sayi;
        }
        return  sonuc;
    }


// index sayısı verip günün adını bulma
    public static String gunAdibul(int günsayisi) {
        if (günsayisi<7) {
            String[] günler = { "Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
                    return günler[günsayisi];
        }
        return "geçersiz";
    }

// Günü verip indexini bulma
    public static int gunsirasibul(String günadi) {
        int günsirasi=0;
            String[] günler = { "Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
            for (int i = 0; i < günler.length; i++) {
                if (günler[i]==günadi) {
                    günsirasi=i;
                }           
        }       
        return günsirasi;
    }


// Gün adını kısaltma
    public static String günadikisalt(String günadi) {
        String[] günlerkisa= { "Pzrtsi","Slı","Çrşmba","Prşmbe","Cma","Cmartsi","Pzr"};
        int günsirasi= gunsirasibul(günadi);
        if (günsirasi!=-1) {
            return günlerkisa[günsirasi];
        } else {
            return "geçersiz";
        }
    }


// Her seferinde alınan yol bir öncekinin yarısı kadarsa toplam yol ne kadar olur
    public static double toplamyol(double yol) {
        double toplam=0;
           while (yol>=1) {     
                 toplam+=yol;     
                    yol=yol/2;
        }           
          return toplam;
        }

// en büyük sayıdan kaç tane var
  public static int ebKacTaneVar(int mumlar[]) {
        int eb= mumlar[0];
        for (int x : mumlar) {
            if(x>eb)
            eb=x;
    }
         int sayac= 0;
         for (int i = 0; i < mumlar.length; i++) {
             if (eb== mumlar[i])
             sayac++;
        }
         return  sayac;
        }


// Doğum tarihin yılın kaçıncı günü
    public static int tarih(int gün,int ay, int yıl) {
            int toplamgun=0;
         int[] aylar={31,28,31,30,31,30,31,31,30,31,30,31};   // değişiklik göstermeyeceği için buraya yazılır     
            if (yıl%4==0) 
            aylar[1]=29;
        for (int i = 0; i < ay-2; i++) {
            toplamgun+=aylar[i];
        }
        toplamgun+=gün;
            return toplamgun;
    }


// Üstte verilen tüm örnekleri yazdırma
    public static void main(String[] args) {
        int[] dizib = {3,6,1};
        System.out.println(diziElemanTopla(dizib));

        int[] dizia = {3,6,1,7};
        diziyazdir(dizia);
        diziyazdir(diziSiralama(dizia));

        int sonuc= usal(5, 3);
                System.out.println(sonuc);

        System.out.println(gunAdibul(2));
        System.out.println(gunsirasibul("Salı"));
        System.out.println(toplamyol(120));

        int[] mum={2,3,5,1,2,4,5,4,5,2};
        System.out.println(ebKacTaneVar(mum));

        int sonuca= tarih(22, 7, 2003);
        System.out.println(sonuca);
    }



*/
public class ders9 {
    public static int diziElemanTopla(int [] dizi) {
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
            
        }
            return toplam;
    }
    public static int[] diziSiralama(int [] dizi) {
        int ebindis, temp;
        for (int i = 0; i < dizi.length; i++) {
            ebindis=i;
            for (int j = i; j < dizi.length; j++) {
                if (dizi[j]>dizi[ebindis]) {
                    ebindis=j;
                }
                temp=dizi[ebindis];
                dizi[ebindis]=dizi[i];
                dizi[i]=temp;
            }
        }
          return dizi;
    }
    
    public static void diziyazdir(int [] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println(" ");
    }
    
    public static int usal(int sayi , int  us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc*=sayi;
        }
        return  sonuc;
    }
    
    public static String gunAdibul(int günsayisi) {
        if (günsayisi<7) {
            String[] günler = { "Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
                    return günler[günsayisi];
        }
        return "geçersiz";
    }
    
    public static int gunsirasibul(String günadi) {
        int günsirasi=0;
            String[] günler = { "Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
            for (int i = 0; i < günler.length; i++) {
                if (günler[i]==günadi) {
                    günsirasi=i;
                }           
        }       
        return günsirasi;
    }
    
    public static String günadikisalt(String günadi) {
        String[] günlerkisa= { "Pzrtsi","Slı","Çrşmba","Prşmbe","Cma","Cmartsi","Pzr"};
        int günsirasi= gunsirasibul(günadi);
        if (günsirasi!=-1) {
            return günlerkisa[günsirasi];
        } else {
            return "geçersiz";
        }
    }

    public static double toplamyol(double yol) {
        double toplam=0;
           while (yol>=1) {     
                 toplam+=yol;     
                    yol=yol/2;
        }           
          return toplam;
        }

    public static int ebKacTaneVar(int mumlar[]) {
        int eb= mumlar[0];
        for (int x : mumlar) {
            if(x>eb)
            eb=x;
    }
         int sayac= 0;
         for (int i = 0; i < mumlar.length; i++) {
             if (eb== mumlar[i])
             sayac++;
        }
         return  sayac;
        }
   
    public static int tarih(int gün,int ay, int yıl) {
            int toplamgun=0;
         int[] aylar={31,28,31,30,31,30,31,31,30,31,30,31};   // değişiklik göstermeyeceği için buraya yazılır     
            if (yıl%4==0) 
            aylar[1]=29;
        for (int i = 0; i < ay-2; i++) {
            toplamgun+=aylar[i];
        }
        toplamgun+=gün;
            return toplamgun;
    }
    
    public static int toplamfiyat(int butce) {

        int [] keyboard={40,60,61};
        int [] usb = {5,8,13};
         int enbuyuk=keyboard[0]+usb[0];
        butce=73;
        int klavyeI=0, usbI=0;
        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < usb.length; j++) {
                if (enbuyuk < keyboard[i]+usb[j]&& keyboard[i]+usb[j]<=butce);
                enbuyuk=keyboard[i]+usb[j];
                klavyeI =i;
                usbI=j;
            }
            {
                
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] dizib = {3,6,1};
        System.out.println(diziElemanTopla(dizib));
        
        int[] dizia = {3,6,1,7};
        diziyazdir(dizia);
        diziyazdir(diziSiralama(dizia));
        
        int sonuc= usal(5, 3);
                System.out.println(sonuc);
                
        System.out.println(gunAdibul(2));
        System.out.println(gunsirasibul("Salı"));
        System.out.println(toplamyol(120));
        
        int[] mum={2,3,5,1,2,4,5,4,5,2};
        System.out.println(ebKacTaneVar(mum));
        
        int sonuca= tarih(22, 7, 2003);
        System.out.println(sonuca);


    }
}


