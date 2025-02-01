
package ders.çalışma;

/*

// Kompozisyon örnek1

class ogrenci{
    public void goster(){
        System.out.println("Öğrenci classının içindeyiz");
    }
}
class sinif{
    ogrenci ali=new ogrenci();
}

public class donem2calışma2 {
    public static void main(String[] args) {
        sinif bd4=new sinif();
        bd4.ali.goster();
    }
}





//Kompozisyon örnek2

class ogrenci{
    public void dersCalisir(){
        System.out.println("Öğrenci ders calişiyor");
    }
}
class hoca{
    public void dersVerir(){
        System.out.println("Hoca ders veriyor");
    }
}
class esyalar{
    int sira,masa,tahta;
}
class sinif{
    esyalar e= new esyalar();
    ogrenci x= new ogrenci();
    hoca y= new hoca();
    public void dersAnlat(){
        System.out.println("Sınıfta ders anlatılır");
    }
}
public class donem2calışma2 {
    public static void main(String[] args) {
        ogrenci ayşe= new ogrenci();
        ayşe.dersCalisir();
        esyalar defter = new esyalar();
        sinif bd4 = new sinif();
        bd4.x.dersCalisir();
        bd4.y.dersVerir();
    }
}


//Kalıtım örnek 1
class memur{
    public void mesai(){
        System.out.println("Memur çalışıyor");
    }
}
  class sekreter extends memur{
    }

public class donem2calışma2 {
    public static void main(String[] args) {
        sekreter ayse = new sekreter();
        ayse.mesai();
        
    }
}


// Kalıtım örnek 2
class bitki {
    public void buyur(){
        System.out.println("Bitkimiz büyür.");
    }
}
class agac extends bitki{
    public void yeserir(){
        System.out.println("Ağacimiz yeşerir.");
    }
}
class kozalak extends agac{
    public void kurur(){
        System.out.println("Kozalaklar kurur.");
    }
}
public class donem2calışma2 {
    public static void main(String[] args) {
        bitki ot= new bitki();
        ot.buyur();
        agac erik = new agac();
        erik.buyur();
        erik.yeserir();
        kozalak x=new kozalak();
        x.buyur();
        x.yeserir();
        x.kurur();
    }
}



// Hem kalıtım hem kompozisyon ortak örnek
    class A{
        public void goster(){
            // kafana göre bir sout eklersin.
        }
    }
    class C{
         public void olustur(){
            // kafana göre bir sout eklersin.
        }
    }
    class B extends A{
        public C x = new C();
        public void git(){
            // kafana göre bir sout eklersin.
        }
    }
    class D extends C{
         public void yaz(){
            // kafana göre bir sout eklersin.
        }
    }
public class donem2calışma2 {
    public static void main(String[] args) {
        A x= new A();
        x.goster();
        B y= new B();
        y.git();
        y.goster();
        y.x.olustur();
        C z= new C();
        z.olustur();
        D t= new D();
        t.yaz();
        t.olustur();
    }
    
}



//Hem kalıtım hem kompozisyon ortak örnek 2

class hayvan {
    public hayvan(){
        System.out.println("Hayvan classının içindeyiz");
    }
}

class kanatlar{
    
}

class kartal extends kanatlar{
    public kartal (){
        System.out.println("Kartal kuştur.");
    }
}

class etcil extends hayvan{
    public etcil(){
        System.out.println("Etcil classı");
    }
    kartal A = new kartal();
}

class erkekaslan{
    public erkekaslan(){
        System.out.println("Erkek aslan");
    }
}

class aslan extends etcil{
    public aslan(){
        System.out.println("aslan classı");
    }
    erkekaslan y= new erkekaslan();
}


//kompozisyon this supperli örnek.

class araba {
    public String Marka ;
    public int yil;
    public araba(String s , int t){
        Marka= s; 
        yil=t;
    }
}
class tofas extends araba{
    public String marka;
    public int yil;
    public tofas(String s, int t){  // Bu kısımda hata var.
        this.marka=s;
        this.yil=t;
      //  super("Mersedes",2010);
    }
}

public class donem2calışma2 {
    public static void main(String[] args) {
        araba x= new araba("reno", 1990);
        tofas y= new tofas("Şahin", 2000);
    }
}
*/
public class donem2calışma2 {
    
}
