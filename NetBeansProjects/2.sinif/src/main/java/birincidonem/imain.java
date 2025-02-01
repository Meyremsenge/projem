
package birincidonem;


public class imain {
    public static void main(String[] args) {
        iHashmap hashmap=new iHashmap(10);
        hashmap.put(25, 50);
        hashmap.put(15, 150);
        hashmap.put(25, 250);
        hashmap.put(35, 350);
        hashmap.put(45, 450);
        System.out.println("TAbloyu ekledikten sonra:");
        hashmap.goster();
        System.out.println("\nAnahtar 15 silindikten sonra");
        hashmap.remove(15);
        hashmap.goster();
        System.out.println("\nAnahtar 25 silindikten sonra");
        hashmap.remove(25);
        hashmap.goster();
        System.out.println("\nAnahtar 5'in değeri: " +hashmap.get(5));
        System.out.println("Anahtar 35'in değeri: " +hashmap.get(35));
        System.out.println("\nTabloyu son haline göre: " );
        hashmap.goster();
        
    }
    
}
