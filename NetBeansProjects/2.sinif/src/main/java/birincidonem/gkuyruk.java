
package birincidonem;


public class gkuyruk {
    gogrenci [] dizi;
    int bas,son;
    int N;
    
    public gkuyruk (int N){
        dizi=new gogrenci[N];
        this.N=N;
        bas=0;    //0. indis    //dizi olduğu için 0 a eşitliyoruz.
        son=0;    //0. indis
    }
    boolean doluMu(){
        if(bas==(son+1)%N)
            return true;
        else
            return false;
    }
    
    boolean bosMu(){
        if(bas==son){
            return true;
        }else{
            return false;
        }
    }
    
    void enQueue(gogrenci yeni){   //Ekleme
        if(!doluMu() ){
            dizi[son]=yeni;
            son=(son+1)%N;
        }
    }
    
    gogrenci deQueue(){
        gogrenci sonuc;
        if(!bosMu()){
            sonuc=dizi[bas];
            bas=(bas+1)%N;
            return sonuc;
        }
        return null; 
    }
    
}
