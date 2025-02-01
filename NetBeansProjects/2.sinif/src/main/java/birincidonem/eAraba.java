
package birincidonem;

public class eAraba {
    private String marka;
    private int yil;
    public eAraba(String marka, int yil){
        this.marka=marka;
        this.yil=yil;
    }
    public String getMarka(){
        return marka;
    }
    public void setMarka(String marka){
        this.marka=marka;
    }
      public int getYil(){
        return yil;
    }
    public void setyil(int yil){
        this.yil=yil;
    }
    public void display(){
        System.out.println("  ?  ");
    }
}
