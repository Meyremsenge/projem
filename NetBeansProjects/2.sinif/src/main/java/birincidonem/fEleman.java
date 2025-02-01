package birincidonem;

public class fEleman{
    
    class Eleman {
        int icerik;
        Eleman ileri;
    public  Eleman(int sayi) {
        this.icerik=sayi;
        ileri=null;
    }}
    public class Yigit{
        Eleman ust;
     
     public Yigit() {
        ust=null;
    }
    
    boolean bosmu(){
        return ust==null;
    }
    void push(Eleman yeni){
        yeni.ileri=ust;
        ust=yeni;
    }
    Eleman pop(){
            Eleman e=ust;
            if (bosmu()) {
                ust = ust.ileri;
        }
            return  e;
                    }
    }}
