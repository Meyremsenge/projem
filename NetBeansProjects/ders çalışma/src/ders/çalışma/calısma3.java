

package ders.çalışma;
import java.util.Scanner;
/*
// isim,karakter,tam ve ondalıksayı yazdır

 String kelime= "meryem";
       int tamSayi= 20;
       Double ondalikSay =10.5;
       char karakter= 'A';
       
                    System.out.println("kelime="+kelime);
              System.out.println("sayı="+tamSayi);
              System.out.println("Ondalıklı sayı="+ondalikSay);
              System.out.println("karakter="+karakter);
              

//Ögrenci adı , Vize ve Final notu ortalama yazdırma

Scanner klavye= new Scanner(System.in);
            System.out.println("Ögrenci adı , Vize ve Final notu ");
            String ogrenciadi1= klavye.next();
            int Vize1= klavye.nextInt();
            int Final1= klavye.nextInt();
            
            double ort;
            ort = (double) (Vize1+Final1)/2;
            System.out.println("öğrenci bilgileri\nIsim\tVize\tOrt");
            System.out.println(ogrenciadi1+ "\t" + Vize1+"\t" + Final1+ "\t" + ort + "\t");



/ Bir sayı gir . 40'tan büyük mü ?
      
            Scanner klavye = new Scanner(System.in);
            System.out.println("Bir sayı gir");
            int sayı = klavye.nextInt();
            
            if (sayı>40) {
                System.out.println("Sayı 40 tan büyüktür");
                
            } else {
                System.out.println("Sayı 40 tan küçüktür");
            }
       

      / toplama çıkarma çarpma bölme
 int a = 3, b = 5;
 int carpim = a * b;
 int toplam = a + b;
 int fark = a - b;
 //Bolum ondalikli cıkabilecegi icin
 //double degisken tanimlayip islemin sonucunu da
 //double olarak almamiz gerekiyor
 double bolum = (double) a / b;
 System.out.println("a = " + a + ", b = " + b +
 "\ntoplam = " + toplam+
 "\nfark = " + fark+
 "\ncarpim = " + carpim+
 "\nbolum = " + bolum);


/ cumle
 String cumle = "Firat Universitesi, Bilgisayar Muhendisligi";
 int uzunluk = cumle.length();
 char ilkKarakter = cumle.charAt(0);
 char sonKarakter = cumle.charAt(uzunluk-1);
 System.out.println("ilkKarakter = " + ilkKarakter);
 System.out.println("sonKarakter = " + sonKarakter);
 
 //ilk bosluk olan yer
 int ilkBoslukIndex = cumle.indexOf(" ");
 System.out.println("ilkBoslukIndex = " + ilkBoslukIndex);
 //son bosluk olan yer
 int sonBoslukIndex = cumle.lastIndexOf(" ");
 System.out.println("sonBoslukIndex = " + sonBoslukIndex);
 //a harfinin ilk gectigi yer
 int ilkAindex = cumle.indexOf("a");
 System.out.println("ilkAindex = " + ilkAindex);
 //z harfinin ilk gectigi yer
 //z olmadigi icin deger -1 olur
 int zIndex = cumle.indexOf("z");
 System.out.println("zIndex = " + zIndex);
 int virgulIndex = cumle.indexOf(",");
 //baslangictan virgule kadar olan parca
 String parca1 = cumle.substring(0,virgulIndex);
 System.out.println("parca1 = " + parca1);
 //virgulden sonuna kadar olan kisim
 String parca2 = cumle.substring(virgulIndex+1);
 System.out.println("parca2 = " + parca2);




*/

public class calısma3 {
    
        public static void main(String[] args) { 
         String cumle = "Firat Universitesi, Bilgisayar Muhendisligi";
int virgulIndex = cumle.indexOf(",");
 String parca2 = cumle.substring(virgulIndex);
 System.out.println("parca2 = " + parca2);
 

                  }
        }
        
            


