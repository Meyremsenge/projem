
package ikincidonem;

 
public class Ikincidonem {

    public static void main(String[] args) {
     int sayı = 10;
        for (int i = 2; i < sayı; i++) {
            if (sayı%i==0) {
                System.out.println("Asal değil");
                break;
            }else{
                System.out.println("asal");
                break;
            }
        }
    }
}
