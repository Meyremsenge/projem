
package birincidonem;

public class jmain {
    public static void main(String[] args) {
    javlagaci tree= new javlagaci();
    tree.kok=tree.inSert(tree.kok, 10);
    tree.kok=tree.inSert(tree.kok, 20);
    tree.kok=tree.inSert(tree.kok, 30);
    tree.kok=tree.inSert(tree.kok, 40);
    tree.kok=tree.inSert(tree.kok, 50);
    tree.kok=tree.inSert(tree.kok, 25);
    
        System.out.println("Oluşturulan ağacın preorder dolaşımı:");
        tree.preorder(tree.kok);
       }
}
