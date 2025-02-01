
package Birincidonemders;
/*

// Örnek 1

abstract class A{
    abstract void SoyMet();
void SomMet(){
            System.out.println("Ben bir somut metodum");
}
}
class B extends A{

        @Override
        void SoyMet() {
            System.out.println("Ben bir soyut metodum");
        }
    
}

public class ikincidonemders4 {
    public static void main(String[] args) {
        B b= new B();
        b.SomMet();
        b.SoyMet();
    }
}



// Örnek 2  (Alan hesabı)

abstract class sekil{
    double boyut1;
    double boyut2;
    sekil(double a, double b) {
        boyut1=a;
        boyut2 = b ;
    }
    abstract double alan();
}

class dikdortgen extends sekil {
    public dikdortgen(double a, double b) {
        super(a, b);
    }

    @Override
    double alan() {
        return boyut1*boyut2;
    }
    
}
class ucgen extends sekil {

    public ucgen(double a, double b) {
        super(a, b);
    }

    @Override
    double alan() {
       return boyut1*boyut2/2;
    }
    
}
public class ikincidonemders4 {
    public static void main(String[] args) {
        dikdortgen d=new dikdortgen(9, 4);
        ucgen u = new ucgen(10, 8);
        sekil ref =d;
        System.out.println("Dikdörtgen Alan="+d.alan());
        System.out.println("Üçgen Alan="+u.alan());
    }
}




// Örnek 3  (Eksik örnek tamamla)
abstract class bankalar{
    abstract class faizOranı()
        }
        class YapıKredi extends bankalar{
            int faizOranı(){
                return 8;
            }
        }
class Garanti extends bankalar{
    

    }
}
public class Banka{
    public static void main(String[] args) {
        bankalar b = new YapıKredi();
        System.out.println("Bankanın faiz oranı%="+b.faizOrani);
    b= new Garanti();
        System.out.println("Bankanın faiz oranı%="+b.faizOrani);
    }
}




//Örnek 4 (çalışan adı ve ücreti)
class Personel{
    int id;
    String isim;
     Personel(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }
}
class emekci extends Personel{
    String ucret ;
    public emekci(int id, String isim) {
        super(id, isim);
        this.ucret="1000";
    }
    void goster() {
        System.out.println(id+"---"+isim+"----"+ucret);
    }
}

public class o{
    public static void main(String[] args) {
        emekci e1= new emekci(1, "ayse");
        e1.goster();
    }
}


//Örnek 5 = Klavyeden girilen dizi şeklinde 10 emekçinin tanımlanması

*/
public class ikincidonemders4 {
    
}

