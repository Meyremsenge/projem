        /*  
        * int = değişken
        * her satırdan sonra noktalı virgül koy
        *bolunen ++ yazılabilir
  System.out.println(bolunen);
tırnakla yaazarsan tırnagın içindeki kelimeyi yazdırır
tırnaksız yazılırsa yukardaki işlemi yapar

ilk örnek
        int bolunen;
        bolunen = 5;
        bolunen = bolunen + 1; 
        bolunen += 1;
        bolunen ++;
          
        System.out.println(bolunen);

    ikinci örnek
 int a = 5;
         int b = 7;
        
        if (a>b) {
            System.out.print("a");
        }else {
            System.out.print("b");
        }
        */
package Birincidonemders;


public class ders1 {

    
    public static void main(String[] args) {
        int a =0;
                 if (a>0){
                     System.out.println("a pozitiftir");
                  
                 }else{
                     if (a<0) {
                         System.out.println("a negatiftir");
                     }else {
                         System.out.println("sıfır");
                     }
                 }
    }   
}
