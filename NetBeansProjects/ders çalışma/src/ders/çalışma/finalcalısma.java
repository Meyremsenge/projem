
package ders.çalışma;

import java.util.Scanner;

/*
// parametreden girilen iki string karakterleri arasında yerleri aynı olmak şartıyla 
birbirinden farklı olan karakterleri birleştirip geri dönderen methodu maine yazınız. Stringler eşit uzunluktadır.
String isim1= "mehmet";
String isim2= "rahmet";
String yeni = "";
    for (int i = 0; i < isim1.length(); i++) {
        if (isim1.charAt(i)!=isim2.charAt(i)) {
            yeni+= isim1.charAt(i)+" "+isim2.charAt(i);
        }
    }
    System.out.println(yeni);




// Klavyeden girilmiş olan iki boyutlu string dizisi içindeki tek karakterlere sahip olanları ekrana yazın




// klavyeden girilen sayılar içinden 0 sayısı girildğinde o ana kadar girilen sayıları toplayip 
sonucu ekrana yazan ve bu işlemi 10 kere tekrarlayan program
        Scanner klavye= new Scanner(System.in);
        int sayac=0;
        int toplam=0;
        
        while (sayac<10) { 
            System.out.println("Sayı giriniz");
            int sayı= klavye.nextInt();
            if (sayı==0) {
                sayac++;
                System.out.println(sayac+" . sayılar toplamı = "+ toplam);
            }else{
                toplam+=sayı;   
            }
    }



// Klavyeden rastgele sayılar giriliyor. bu sayılar içinden 10 tane asal sayı girildiğinde bu sayıları diziye atan ve
 dizideki en büyük sayıyı ekrana yazan programı yazıjnız

(olmadı)

    int sayac=0;
    int [] dizi= new int[10];
Scanner klavye = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
  int sayı = klavye.nextInt();
           if (sayı%i!=0) {
        dizi[sayac]=sayı;
         sayac++;
           }
           else{
               i=i-1;
               
           }
        }
        
          for (int j = 0; j < dizi.length; j++) {
                    System.out.println(dizi[j]);
        
    }
    int eb=dizi[0];
         for (int i = 0; i < dizi.length; i++) {
             if (eb<dizi[i]) {
                 eb=dizi[i];
             }
             
    }
         System.out.println(eb);
    }

// Kendisine parametre olarak gelen stringdeki boşlukları stringleri geri döndüren rekürsif ffonksiyon yazınız




// Σ 3, j=1   Π   3 , k=1 [ (1+j) üssü k! / (cos(k)  ]
import static java.lang.Math.*;

public class finalcalısma {
    public static void main(String[] args) {
        double sonuc = denklemiCoz();
        System.out.println("Denklemin Sonucu: " + sonuc);
    }

    public static double denklemiCoz() {
        double sonuc = 0;

        for (int j = 1; j <= 3; j++) {
            for (int k = 1; k <= 3; k++) {
                double kFaktoriyel = 1;

                for (int i = 1; i <= k; i++) {
                    kFaktoriyel *= i; //k değişkenini kulladığım için i dedim aslında sorudaki (1+j)^(k!) kısmındaki k! i hesaplıyor
                }

                double cosK = cos(k);

                if (cosK != 0) {// bu kısmı yazmazsanız 0 a bölünebilme hatası alabilirsiniz. (Vscode kullanıyorsanuz Nan yazar)
                    double taban = pow(1 + j, kFaktoriyel);
                    double payda = cosK;

                    sonuc += taban / payda;
                }
            }
        }
        return sonuc;
    }




// Büyük harfe çevirme
 public static String buyukHarfeCevir(String kelime) {
        String a= "";
        char[] dizi = new char[kelime.length()];
        for (int i = 0; i < kelime.length(); i++) {
            dizi[i]= kelime.charAt(i);
            if (dizi[i]>=97 && dizi[i]<=122) {
                dizi[i]=(char)(dizi[i]-32);                
            }
            a+=dizi[i];
        }
        return  a ;
    }
    public static void main(String[] args) {
        System.out.println(buyukHarfeCevir("Meyrem Şenge"));
        
    }



//Büyük harfe çevrme çözüm 2
    public static void main(String[] args) {
        String isim=" Meryem";
        String isim2="";
        for (int i = 0; i < isim.length(); i++) {
            if (isim.charAt(i)>=97&& isim.charAt(i)<=122) {
                isim2+=(char)(isim.charAt(i)-32);
                
            } else {
                isim2+= (char) isim.charAt(i);
            }
        }
        System.out.println(isim2);
    }




// Σ 3, j=1   Π   3 , k=1 [ (1+j) üssü k! / (cos(k)  ]

 public static double fonk(){
            
            double x=1.0 , top=0.0;
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                  x= x*Math.pow((1+j),faktoryel(k) )/Math.cos(Math.toRadians(k));
                }
                top = top + x ; 
                x=1.0;
            }
            return top ;
        }
        
        
        public static int faktoryel(int m){
            int sonuc=1;
            for (int i = 1; i <=m ; i++) {
                sonuc = sonuc*i;
            }
            return sonuc;
        }





// aaabbccccdd = a3b2c4d2   şeklinde yazdır


               
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
        System.out.println(kelime.charAt(kelime.length()-1) +""+sayac);  // son sayı for içinde sayılmadı. kelime.length()-1 yazdığımız için



*/
public class finalcalısma {
    public static char ozelkarakter(char karakter) {
        String ozelkarakterler = "!@#$%*&+";
        char [] dizi = {'!','@','#','$','%','*','&','+'};
    
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < ozelkarakterler.length(); j++) {
                if (dizi[i]==ozelkarakterler.charAt(j)) {
                    System.out.println("");
                } else {
             
                }
            }
        }
        return karakter;
    }
    public static void main(String[] args) {
        

}
    

}
  

        

