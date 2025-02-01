
package birincidonem;


public class kkuyruk {
    kDugum bas;
    kDugum son;
    public kkuyruk(){
        bas=null;
        son=null;
        
    }
    boolean BosMu(){
        return  bas==null;
    }
    void ekle(kDugum yeni){
        if(!BosMu()){
            son.ileri=yeni;
        }else{
            bas=yeni;
        }
        son=yeni;
    }
    kDugum sil(){
        kDugum sonuc=bas;
        if (!BosMu()) {
            bas=bas.ileri;
            if (bas==null) {
                son=null;
            }
                }
            return sonuc;
    }
}
