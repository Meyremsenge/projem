
package Birincidonemders;
import java.util.Scanner;

public class ders3 {
/*
        String kelime ="meryem";
    double ondalikSayi =1.4; 
    int tamSayi= 40;
       char karakter = 'A';
            
             System.out.println("kelime="+kelime);
              System.out.println("sayı="+tamSayi);
              System.out.println("Ondalıklı sayı="+ondalikSay);
              System.out.println("karakter="+karakter);
    
    //2.yol
    
    System.out.println("\nDegiskenler\n---------"
                 "\ntamSayı = " + tamSayı
                "\nondalikSayi = " + ondalikSayi
                " \nkarakter = " + karakter
                "\nkelime ="+ kelime );
    
    */    

    /*
    int sayı1=5 , sayı2=10;
int toplam= sayı1+sayı2;
int carpim = sayı1*sayı2;
int bölüm = sayı1/sayı1;
int çıkarma = sayı2-sayı1;
        System.out.println(toplam +carpim+bölüm+çıkarma );  //hepsini toplama
       System.out.println("sayı1=" + sayı1 + ",sayı2=" + sayi2
    
    /hocanın yaptığı
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
    
    */
    
    /*
        Scanner klavye = new Scanner(System.in);
        System.out.println("ilk öğrenci adı ,vize ve final notu:");
       String isim1 = klavye.next();
        int vize1= klavye.nextint();
        int fin1 = klavye.nextInt();
        System.out.println("İkinci öğrenci adı ,vize ve final notu");
        String isim2 = klavye.next();
        int vize2= klavye.nextint();
        int fin2 = klavye.nextInt();
        double ort1,ort2;
        ort1  =  (double) (vize1 + fin1 )/2;
        ort2  =  (double) (vize2 + fin2 )/2 ;
        System.out.println("öğrenci bilgileri\nIsim\tVize\tOrt")
        System.out.println(isim1 + "\t" + vize1+"\t" + fin1+ "\t" + ort1 + "\t")
        System.out.println(isim2 + "\t" + vize2+"\t" + fin2 + "\t" + ort2 + "\t")
    */
    
    /*
            Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayı1 = klavye.nextInt();
         if (sayı1>40) {
             System.out.println("Sayı 40'tan büyüktür");
            
        } else {
             System.out.println("Sayı 40'tan küçüktür");
        }
    */
    
    /*
            Scanner klavye = new Scanner(System.in);
        System.out.println("Bir not giriniz");
         int not = klavye.nextInt();
        if (90<not) {
            System.out.println("A");
        } else if (80<not) {
            System.out.println("B");
            
        } else if (70<not) {
            System.out.println("C");
        } else if (60<not) {
            System.out.println("D");
        } else if (50<not) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    */
   
    
    
    /*
            Scanner klavye=new Scanner(System.in);
        char ara;
        System.out.println("Üç karakter giriniz");
        char a=klavye.next().charAt(0);
        char b=klavye.next().charAt(0);        
        char c=klavye.next().charAt(0);
        if (a>b) {
            ara=a;        a=b;     b=ara;   // geçici değişken
            
        }
        if ( a>c) {
            ara=a;        a=c;       c=ara;
        }
        if (b>c) {
            ara=b;         b=c;         c=ara;
           
        }
        System.out.println("Sıralanmış karakterler:" +a+ "  "+b+ ""+c+);  //son kısım eksik yazdım ??
      
    */
    
    
    /*
    int i=1,   j=2 , k=3;

        if (i>j) 
            if (i>k) 
                System.out.println("A");
                
            else               //en son yazılan if'in   else'idir
                System.out.println("B");
    */
      /*  int a=5, b=7;
        System.out.println(a+b+"=a+b" );  //ilk sayıları yazarsan toplama yaoar. tırnağı ilk yaparsan 2 sayıyı yanyana yazar
        // (a+b+"=a+b" ) = 12       ,        ("a+b="+a+b") = 57 
        */
    
        /*
        yazı= "deneme\"önemli\"deneme"
        
        \" çift tırnak 
        \' tek tırnak
        \\ ters eğik çizgi
        \n yeni satır
        \r satır başı
        \t tab tuşu
        */    
    
    public static void main(String[] args) {
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
        
        
        
        }

    }

