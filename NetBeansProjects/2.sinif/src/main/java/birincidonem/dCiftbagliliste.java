
package birincidonem;


public class dCiftbagliliste {
    dEleman bas;
    dEleman son;
    public dCiftbagliliste(){
        bas=null;
        son=null;
    }
    public void basaEkle(dEleman yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }else{
            yeni.ileri=bas;
            bas.geri=yeni;
            bas=yeni;
        }
    }
    public void sonaEkle(dEleman yeni){
         if(bas==null){
            bas=yeni;
            son=yeni;
        }else{
             yeni.geri=son;
             son.ileri=yeni;
             son=yeni;
         }
    }
    public void bastanSil(){
        if (bas.ileri==null) {
            son=null;
        } else {
            bas.ileri.geri=null;
            bas=bas.ileri;
        }
    }
    public void sondanSil(){
        if (bas.ileri==null) {
            bas=null;
        } else {
            son.geri.ileri=null;
            son=son.geri;
            /*
            son=son.geri;
            son.ileri=null;     //ikinci yol.
            */
        } 
    }
    public void eklenecekSayi(int nereye, dEleman ekleneceksayi){
        dEleman yedek=bas;
        while (yedek.sayi !=nereye) {            
            yedek=yedek.ileri;
            if (yedek==null) {
                System.out.println("Hiç eleman yok");
            }
        }
        if (yedek==son) {
            ekleneceksayi.ileri=null;
            son=ekleneceksayi;
        } else {
            ekleneceksayi.ileri=yedek.ileri;
            yedek.ileri.geri=ekleneceksayi;
        }
    }
    public void silinecekSayi(int aranan){
         dEleman yedek=bas;
        while (yedek.sayi !=aranan) {            
            yedek=yedek.ileri;
            if (yedek==null) {
                System.out.println("Hiç eleman yok");
            }
        }
        if (yedek==bas) {
            bas=yedek.ileri;
        } else{
            yedek.geri.ileri=yedek.ileri;
            yedek.ileri.geri=yedek.geri;
        }
    }
    String listele(){
        dEleman yedek= bas;
        String liste=" ";
        while (yedek!=null) {            
            liste=liste+yedek.sayi+"-->";
            yedek=yedek.ileri;
        }
        return liste;
    }
    
    
}
