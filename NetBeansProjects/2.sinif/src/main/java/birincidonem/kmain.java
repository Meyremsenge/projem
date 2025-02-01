
package birincidonem;




public class kmain {
    public static void main(String[] args) {
        kAgac a=new kAgac();
        a.ekle(new kDugum(8));
        a.ekle(new kDugum(4));
        a.ekle(new kDugum(12));
        a.ekle(new kDugum(2));
        a.ekle(new kDugum(5));
        a.ekle(new kDugum(9));
        a.ekle(new kDugum(14));
        System.out.println("Ağaç yapısı:");
        a.seviye_goster();
        System.out.println(" ");
        System.out.println("Yapraktan sil:");
        System.out.println(a.yapraksil(2));
        a.seviye_goster();
        System.out.println(" ");
        System.out.println("İnorder Gösterim:");
        a.inorder(a.kok);
        System.out.println(" ");
        System.out.println(" Preorder Gösterim:");
        a.preorder(a.kok);
        System.out.println(" ");
        System.out.println("Postorder Gösterim: ");
        a.postorder(a.kok);
    }
}
