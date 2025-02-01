
package ders.çalışma;

/* Final Sorusu 1: Bir polinom sınıfı oluşturmanız gerekmektedir. Bu sınıfın her bir nesnesi farklı derecelerden olabilir. Polinomdaki katsayılar bir dizide tutulan
bir very alanına sahiptir. Örneğin: 5x³+2x+1 polinomunda katsayılar-[1,2,0,5] ve derecesi 3'tür.

-Polinom sınıfı verilen katsayı dizisi ile polinomu oluşturan bir kurucu metodu vardır.
-Kendisine parametre olarak bir polinom nesnesi alan ve mevcut polinom ile toplamını yaparak bir polinom nesnesi döndüren 
public polinom topla(polinom p){} metodunu sınıfa ekleyiniz.
-Kendisine bir x değeri alan ve verilen x değerine göre polinomu hesaplayan public int hesapla(int x) {} metodunu yazınız?
-Polinomu ekranda gösteren (Örneğin: 5x³+2x+1 polinomunu 5x^3+2x+1 şeklinde gösteren public void goster() {} metodunu yazınız?
*/
    public class Polinom {  
    private int[] katsayilar;  

    // Kurucu metod  
    public Polinom(int[] katsayilar) {  
        this.katsayilar = katsayilar;  
    }  

    // Toplama metodu  
    public Polinom topla(Polinom p) {  
        // Katsayılar dizilerinin uzunluklarını bul  
        int uzunluk1 = this.katsayilar.length;  
        int uzunluk2 = p.katsayilar.length;  

        // En büyük uzunluğu belirle  
        int uzunluk = Math.max(uzunluk1, uzunluk2);  

        // Yeni bir katsayılar dizisi oluştur  
        int[] yeniKatsayilar = new int[uzunluk];  

        // Katsayıları topla  
        for (int i = 0; i < uzunluk; i++) {  
            if (i < uzunluk1) {  
                yeniKatsayilar[i] += this.katsayilar[i];  
            }  
            if (i < uzunluk2) {  
                yeniKatsayilar[i] += p.katsayilar[i];  
            }  
        }  

        // Yeni bir polinom nesnesi oluştur ve döndür  
        return new Polinom(yeniKatsayilar);  
    }  

    // Hesaplama metodu  
    public int hesapla(int x) {  
        int sonuc = 0;  
        for (int i = 0; i < katsayilar.length; i++) {  
            sonuc += katsayilar[i] * Math.pow(x, i);  
        }  
        return sonuc;  
    }  

    // Gösterme metodu  
    public void goster() {  
        StringBuilder sb = new StringBuilder();  
        for (int i = katsayilar.length - 1; i >= 0; i--) {  
            if (katsayilar[i] != 0) {  
                sb.append(katsayilar[i]);  
                if (i > 0) {  
                    sb.append("x");  
                    if (i > 1) {  
                        sb.append("^").append(i);  
                    }  
                }  
                if (i > 0 && katsayilar[i - 1] > 0) {  
                    sb.append("+");  
                }  
            }  
        }  
        System.out.println(sb.toString());  
    }  


    public static void main(String[] args) {  
        // İlk polinomun katsayıları  
        int[] katsayilar1 = {1, 2, 0, 5};  
        Polinom polinom1 = new Polinom(katsayilar1);  

        // İkinci polinomun katsayıları  
        int[] katsayilar2 = {3, -1, 2};  
        Polinom polinom2 = new Polinom(katsayilar2);  

        // Polinomları ekrana göster  
        polinom1.goster(); // 5x^3+2x+1  
        polinom2.goster(); // 3x^2-x+2  

        // Polinomları topla  
        Polinom toplamPolinom = polinom1.topla(polinom2);  

        // Toplam polinomu ekrana göster  
        toplamPolinom.goster(); // 5x^3+3x^2+x+3  

        // x = 2 için polinom1'i hesapla  
        int sonuc = polinom1.hesapla(2);  
        System.out.println("Polinom1(x=2) = " + sonuc); // Polinom1(x=2) = 45  
    }  
}  
