
package birincidonem;


public class javlagaci {
    jdugum kok;
    int height(jdugum N){
        if (N==null) {
            return 0;
        }
        return N.yukseklik;
    }
    int max(int a, int b){
        return (a>b) ? a:b;   //Sağlıyorsa a yı sağlamıyorsa b yi döndürür.
    }
    jdugum sagaDondur(jdugum y){
        jdugum x=y.sol;
        jdugum t2=x.sag;
        x.sag=y;
        y.sol=t2;
        y.yukseklik=max(height(y.sol), height(y.sag))+1;
        x.yukseklik=max(height(x.sol), height(x.sag))+1;
        return x;
    }
    jdugum soladondur(jdugum x){
        jdugum y=x.sag;
        jdugum t2=y.sol;
        y.sol=x;
        x.sag=t2;
        x.yukseklik=max(height(x.sol), height(x.sag))+1;
        y.yukseklik=max(height(y.sol), height(y.sag))+1;
        return y;
    }
    int getbalance(jdugum N){   // Dengedemi yükseklikleri
        if (N==null){
            return 0;
        }
        return height(N.sol)-height(N.sag);
    }
    jdugum inSert(jdugum node, int key){   //Ekleme
        if (node==null) {
               return (new jdugum(key));
        }
        if (key<node.anahtar) {
            node.sol=inSert(node.sol, key);
        }
        else if (key>node.anahtar) {
            node.sag=inSert(node.sag, key);
        }
        else{
            return node;}
       node.yukseklik=1+max(height(node.sol), height(node.sag));
       int balance=getbalance(node);
        if (balance>1 && key<node.sol.anahtar) {  //Düğüm sola eğilimli ve yeni anahtar sol alt ağaca eklenmelidir.
            return sagaDondur(node);  
        } if(balance<-1 && key>node.sag.anahtar) {//Düğüm sağa eğilimli ve yeni anahtar sağ alt ağaca eklenmelidir.
            return soladondur(node);
        }
        if (balance>1 && key>node.sol.anahtar) {//Düğüm sola eğilimli ancak sol alt ağacı sağ alt ağacına
            node.sol=soladondur(node.sol);
            return sagaDondur(node);
        }
         if (balance<-1 && key< node.sag.anahtar) {//Düğüm sola eğilimli ancak sol alt ağacı sağ alt ağacına
            node.sag=sagaDondur(node.sag);
            return soladondur(node);
    }
    return node;
}
    
    void preorder(jdugum node){
        if(node!=null){
            System.out.println(node.anahtar+" ");
            preorder(node.sol);
            preorder(node.sag);
        }
    }
}