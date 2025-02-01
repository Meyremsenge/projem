
package birincidonem;


public class gbaglikuyruk {
    gdugum bas,son;
    public gbaglikuyruk(){
        bas=null;
        son=null;       //Bağlı liste olduğu için null a eşitliyoruz.
    }
    
    boolean bosMu(){
        return bas==null;
    }
    
    void enqueue(gdugum yeni){
        if (bosMu()) {
            bas=yeni;
            son=yeni;
        } else {
            son.ileri=yeni;
            son=yeni;
        }
    }
    
    gdugum dequeue(){
        gdugum sonuc;
        sonuc=bas;
        if (!bosMu()) {
            bas=bas.ileri;
            if (bas==null) {
                sonuc=null;
            }
        } 
        return sonuc;
    }
}

 
