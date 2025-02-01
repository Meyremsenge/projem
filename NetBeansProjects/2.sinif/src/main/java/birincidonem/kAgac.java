
package birincidonem;


public class kAgac {
    kDugum kok;

    public kAgac() {
    kok=null;
    }
    
    kDugum agacAra(int eleman){
        kDugum d;
        d=kok;
        while (d!=null) {            
            if(d.icerik==eleman){
                return d;
            }else if(d.icerik>eleman){
                d=d.sol;
            }else{
                d=d.sag;
            }
        }
        return null;
    }
    
    kDugum min(){
        kDugum sonuc= kok;
        while(sonuc.sol!=null){
            sonuc=sonuc.sol;
        }
        return sonuc;
    }
    
     kDugum max(){
        kDugum sonuc= kok;
        while(sonuc.sag!=null){
            sonuc=sonuc.sag;
        }
        return sonuc;
    }
     
     void ekle(kDugum yeni){
         kDugum y=null;
         kDugum x= kok;
         while (x!=null) {             
             y=x;
             if (yeni.icerik<x.icerik) {
                 x=x.sol;
             } else {
                 x=x.sag;
             }
         }
         if (y==null) {
             kok=yeni;
         }else if(yeni.icerik<y.icerik){
             y.sol=yeni;
         }else{
             y.sag=yeni;
         }
     }
     
     void inorder(kDugum node){  //sol ,kok,sağ
         if (node==null) {
             return;
         }
         inorder(node.sol);
         System.out.print(node.icerik+" ");
         inorder(node.sag);
     }
     
     void preorder(kDugum node){  // kök,sol,sağ
        if (node==null) {
             return;
         }
         System.out.print(node.icerik+" ");
         preorder(node.sol);   
         preorder(node.sag);  
     }
     
          void postorder(kDugum node){  //sol,sağ, kök
        if (node==null) {
             return;
         }      
         postorder(node.sol);   
         postorder(node.sag);  
         System.out.print(node.icerik+" ");
     }
          
          public boolean yapraksil(int key){
              kDugum current=kok;
              kDugum parent=kok;
              boolean isLeftChild=true;
              while (current.icerik!=key) {                  
                  parent=current;
                  if (key<current.icerik) {
                      isLeftChild=true;
                      current=current.sol;
                  } else {
                      isLeftChild=false;
                      current=current.sag;
                  }
                  if (current==null) {
                      return false;
                  }
              }
              if(current.sol==null && current.sag==null){
                  if (current==kok) {
                      kok=null;
                  } else if(isLeftChild){
                      parent.sol=null;
                  }else{
                      parent.sag=null;
                  }
                  return true;
              }else{
                  return false;
              }
          }
          void seviye_goster(){
              kkuyruk k=new kkuyruk();
              kDugum tmp=kok;
              if (tmp!=null) {
                  k.ekle(tmp);
              }
              int i=0 , j=0;
              System.out.print(" ");
              int top=0;
              while (!k.BosMu()) {                  
                  tmp=k.sil();
                  top+= tmp.icerik;
                  if (tmp.sol!=null) {
                      k.ekle(tmp.sol);
                  }
                  if (tmp.sag!=null) {
                      k.ekle(tmp.sag);
                  }
                  System.out.print(tmp.icerik+" \t");
                  int us =(int) Math.pow(2, j);
                  i++;
                  if (i==us) {
                      j=j+1;
                      i=0;
                      System.out.println("");
                  }
              }
              System.out.println("Toplam:"+top);
          }
          
}
