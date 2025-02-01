
package birincidonem;

import java.util.Scanner;


public class ADers1 {
    int boyut;
    String [] elemanlar;
    int indis;
    
    public void Dizi(int boyut){
        this.boyut=boyut;
        this.elemanlar=new String[boyut];
        this.indis=0;
    }
    /*
    public void dizi(int boyut){
    String [ ]  elemanlar=new String[boyut];
     indis=0;
    }
  */
            
              public void ekle(String kelime){
                    if (this.indis<this.boyut) {
                    this.elemanlar[this.indis]=kelime;
                    this.indis++;
                }else{
                    System.out.println("Dizi Dolu");
                }
              }
            public int arama(String aranan){
                for (int index = 0; index < this.indis; index++) {
                    if (elemanlar[index].equals(aranan)) {
                        return index;
                    }
                }
                return -1;
            }
            public void yazdır(){
                if (this.indis<=0) {
                    System.out.println("Dizi boş");
                    
                }else{
                    System.out.println("( ");
                    for (int i = 0; i < indis; i++) {
                        System.out.println(elemanlar[i]+",");
                        
                    }
                    System.out.println(")");
                }
            }
            public void sil(String kelime){
                int i=arama(kelime);
                if (i  !=-1) {
                    while (1<this.indis-1) {                        
                        this.elemanlar[i]=this.elemanlar[i+1];
                        i++;
                    }
                    this.indis--;
                    
                }else{
                    System.out.println("Silinecek eleman bulunamadı.");
                }
            } 
            public void guncelle(String kelime, String silinecek){
                int i =arama(silinecek);
                if(i!=-1){
                    this.elemanlar[i]=kelime;
                }else{
                    System.out.println("Güncellenecek eleman blunamadı");
                }
                
            }

            public static void main(String[] args) {
                ADizi dizi=new ADizi(6);
                Scanner klavye = new Scanner(System.in);
                int secim=0;
                do{
                    System.out.println("***********Menü************");
                    System.out.println("1-Ekle");
                    System.out.println("2-Sil");
                    System.out.println("3-Güncelle");
                    System.out.println("4-Ekrana Yazdir");
                    System.out.println("5-Ara");
                    System.out.println("6-Çıkış");
                    System.out.println("Seçiminizi giriniz");
                    secim=klavye.nextInt();
                    klavye.nextLine();
                    String kelime;
                    switch (secim) {
                        case 1:
                            System.out.println("Eklenecek kelimeyi giriniz: ");
                            kelime=klavye.nextLine();
                            dizi.ekle(kelime);
                            break;
                        case 2:
                            System.out.println("Silinecek kelimeyi giriniz: ");
                            kelime=klavye.nextLine();
                            dizi.sil(kelime);
                            break;     
                           case 3:
                            System.out.println("Değiştirmek istediğiniz kelimeyi giriniz: ");
                            kelime=klavye.nextLine();
                               System.out.println("İkingi kelimenizi giriniz");
                               String guncellenecek=klavye.nextLine();
                            dizi.guncelle(kelime, guncellenecek);
                            break;     
                           case 4:
                               System.out.println("Dizideki elemanlar");
                               dizi.yazdir();
                           break;
                           case 5:
                               System.out.println("Aranacak kelime: ");
                               kelime=klavye.nextLine();
                               System.out.println(dizi.arama(kelime));
                               break;
                           case 6:
                               System.out.println("Çıkış yap");
                               secim=8;
                               break;
                        
                    }
                }while(secim !=8);
                
            
    }
}

