
package Birincidonemders;
interface Calisan {
public void calis();

class mudur implements Calisan{
    @Override
    public void calis(){
        System.out.println("Müdür çalışıyor");
    }
}
class genelMudur extends mudur{
    @Override
    public void calis(){
        System.out.println("Genel mudur calısıyor");
    }
    public void toplantıYonet(){
        System.out.println("Genel mjudur toplantı yonetiyor");
    }
}
class programcı implements Calisan{
    public void calıs(){
        System.out.println("Programcı calısıyor");
    }
        @Override
        public void calis() {
             }
    }
class analizProgramci extends programcı{
    public void analizYap(){
        System.out.println("Analiz programcıları program yapıyor");
    }
}
class sistemProgramci extends programcı{
    public void sistemİncele(){
        System.out.println("Sistem programcıları sistemiyor");
    }
}
class pazarlamaci implements Calisan{
    @Override
    public void calis(){
        System.out.println("pazarlamacı calisiyorr");
    }
}
class sekreter implements Calisan{
    @Override
    public void calis(){
        System.out.println("sekreter calisiyorr");
    }
}
public class ikincidonemders55 {
    public static void mesai(Calisan[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i].calis();
        }
    }
    public static void main(String[] args) {
        Calisan [] c = new Calisan[7];
        c[0]=new programcı() ;
        c[1]=new pazarlamaci() ;
        c[2]=new mudur() ;
        c[3]=new  genelMudur();
        c[4]=new analizProgramci() ;
        c[5]=new  sistemProgramci();
        c[6]=new  sekreter();
        mesai(c);
    }
}
}
