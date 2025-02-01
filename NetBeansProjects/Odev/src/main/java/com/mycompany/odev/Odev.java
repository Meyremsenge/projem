
package Odev;


public class Odev {

    public static void main(String[] args) {
    /*
        - Mevcut yıldan (2023), doğum yılını çıkararak kaba bir yaş hesabı yapılabilmektedir. Yasal olarak reşit
sayılma yaşı 18 olarak belirlenmiştir. Doğum yılı girilen bir kişinin reşit olup olmadığını bulan kodu
yazınız
        */
    int mevcutyıl= 2023;
    int doğumyılı= 2003;
    int yas= doğumyılı-mevcutyıl;
        if (yas>18) {
            System.out.println("reşit");
            
        } else {
            System.out.println("Reşit değil");
        }
    }
}
