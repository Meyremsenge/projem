
package birincidonem;


public class cBListe {
    cEleman bas,son;
    public cBListe(){
        bas= null;
        son=null;
    }
    
    public void basaEkle(cEleman yeni){
        if(son== null){
            bas=yeni;
            son=yeni;
        }else{
            yeni.ileri=bas;
            bas=yeni;
        }
    }
    
    public void sonaEkle(cEleman yeni){
        if(son== null){
            bas=yeni;
            son=yeni;
        }else{
            son.ileri=yeni;
            son=yeni;
        }
    }
    
    public cEleman bastanSil(){
         cEleman tmp =bas;
         if(bas!=null){
             bas=bas.ileri;
         }else{
             son=null;
             return null;
         }
         return tmp;
    }
    
    public cEleman sondanSil(){
        cEleman tmp=bas, once=null, silinen=son;
        while (tmp!=son) {      
            once=tmp;
            tmp=tmp.ileri;
        }
        if (once==null) {
            bas=null;
            son=null;
            return null;
        } else {
            once.ileri=null;
            son=once;
            return silinen;
        }
    }
    
    public cEleman ara(int aranan){
       cEleman tmp=bas;
        while (tmp!=null) {            
            if (tmp.icerik==aranan) {
                return tmp;
            } else {
                tmp=tmp.ileri;
            }
        }
        return null;
    }
    
    public String listele(){
        String s="";
        cEleman tmp=bas;
        while (tmp!=null) {            
            s=s+tmp.icerik + "-->";
            tmp=tmp.ileri;
        }
        return s;
    }

    void basaekle(cEleman yeni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    cEleman bastansil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
