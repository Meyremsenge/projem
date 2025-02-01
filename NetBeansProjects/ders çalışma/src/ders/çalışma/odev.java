
package ders.çalışma;

import java.util.Scanner;

public class odev {

        /*
        1- Mevcut yıldan (2023), doğum yılını çıkararak kaba bir yaş hesabı yapılabilmektedir. Yasal olarak reşit
sayılma yaşı 18 olarak belirlenmiştir. Doğum yılı girilen bir kişinin reşit olup olmadığını bulan kodu
yazınız
        
    int mevcutyıl= 2023;
    int doğumyılı= 2003;
    int yas= mevcutyıl-doğumyılı;
        if (yas>18) {
            System.out.println("reşit");
            
        } else {
            System.out.println("Reşit değil");
        }
    
    
    
    // 2-not harflendirme
    
                Scanner klavye = new Scanner(System.in);
            System.out.println("Bir not giriniz");
            int not= klavye.nextInt();
            if (90<=not) {
                System.out.println("AA");
            } else if (80<=not) {
                System.out.println("AB");              
            } else if (75<=not) {
                System.out.println("BB");               
            } else if (70<=not) {
                System.out.println("CB");
            } else if (60<=not) {
                System.out.println("CC");
            } else if (50<=not) {
                System.out.println("DC");         
            } else {
                System.out.println("FF");
            }
    
    
    // 3-Dersten başarılı olma durumu
                 Scanner klavye = new Scanner(System.in);
                System.out.println("Vize ve final notlarını ve dvamsızlık durumunu giriniz");
                int vize = klavye.nextInt();
                int finall = klavye.nextInt();
                int devamsizlik= klavye.nextInt();
                double YSS =(double)( 0.4 * vize + 0.6 * finall);
                
                System.out.println("Vize notu="+ vize);
                System.out.println("Final notu="+ finall);                
                System.out.println("Devamsızlık="+ devamsizlik);        
                System.out.println("Yıl Sonu  Puanı"+ YSS);
               
                if (YSS>=50  &&  finall>=50 && devamsizlik<=4) {
                    
                    System.out.println("GEÇTİNİZ");
                    
                } else {
                    System.out.println("KALDINIZ");
                }

    
    
    // 4- Bir mağazada 10% indirimli fiyat üzerinden 10% indirim daha uygulanmaktadır. Bu mağazadaki 
ürünün indirimsiz fiyatı giriş olarak alınmaktadır. Ürün fiyatına göre indirim tutarını hesaplayan ve 
uygulanan toplam indirim miktarının 20 TL ve üstü olup olmadığını bulan kodu yazınız
    
    
                Scanner klavye= new Scanner(System.in);
                int giriş= klavye.nextInt();
                double ilkindirim= (double) ( giriş*10)/100;
                double indirimlifiyat1= giriş-ilkindirim;
                double ikinciindirim=(indirimlifiyat1*10)/100;
                double indirimlifiyat2 = indirimlifiyat1-ikinciindirim;
                double tolpamindirim= ilkindirim+ikinciindirim;
                
                System.out.println("ilk fiyat="+giriş);
                System.out.println("ilk indirim="+ ilkindirim);
                System.out.println("ikinci indirim="+ikinciindirim);
                System.out.println("toplam indirim="+tolpamindirim);
                
                
                if (tolpamindirim>20) {
                    System.out.println("Toplam indirim 20 liradan fazladır");
                } else {
                    System.out.println("Toplam indirim 20 liradan azdır");
              
                }
    
    5- Bir online alışveriş sitesinde kargo fiyatı 30 TL’dir. Ürün fiyatı 150 TL ve üstü olan sepetler için kargo 
ücreti alınmamaktadır. Sitede ayrıca alışveriş sepeti toplamı 250 TL ve üstü alışverişlere %10 indirim
kampanyası bulunmaktadır. Alışveriş sepetinin tutarı bilinen bir müşterinin kargo dahil ödemesi 
gereken ücreti hesaplayan kodu yazınız. 
    
                Scanner klavye = new Scanner(System.in);
                System.out.println("Ürün ücreti ne kadar?)
                int urunfiyat = klavye.nextInt();
                int kargo = 30;
                int toplam = kargo+urunfiyat;
                
                    double indirim= (double)(urunfiyat*10 )/100 ;
                    double toplam2= (double)(urunfiyat-indirim);
           
                if (urunfiyat>=250) {
                    System.out.println("Sepet tutarı="+toplam2);
                    
                } else if (urunfiyat>=150) {
                     toplam= urunfiyat;
                    System.out.println("Sepet tutarı="+toplam);
                } else {
                    System.out.println("Sepet tutaru="+toplam);
                }
                
    
    
    // - Bir internet kafede masa açılış ücreti 20 TL olarak belirlenmekte ve 0-30 dk arası ücretlendirme 
değişmemektedir. 30-60 dk için her 5 dakikada 2 TL ücret farkı yansımaktadır. 60-120 dk arası her 5 
dakikada 1 TL ücret farkı yansımaktadır. 120 dk’dan sonra ise her 10 dk’da 1 TL ücret farkı 
yansımaktadır. Bu durumda müşterilerin kaç dakika zaman harcama bilgisine göre ödemesi gereken 
ücreti hesaplayan kodu yazınız

    
                Scanner klavye = new Scanner(System.in);
                int masaacilis= 30;

                
                System.out.println("Kaç dakikka zaman harcadın?");
                int sure= klavye.nextInt();
                int sure2=(int) (sure-30)*2/5;
                int sure3=(int)(sure-60)/5;
                int sure4= (int)(sure-120)/10;
                        if (sure<30) {
                            System.out.println(masaacilis);         
           }             
                       else if (sure<60) {
                            sure=sure-30;
                            masaacilis=30+sure2;
                            System.out.println(masaacilis);   
                                
                            }
                      else    if (sure<120) {
                            sure=sure-60;
                            masaacilis=42+sure3;
                            System.out.println(masaacilis);   
                                
                            }
                         else   if (sure>120) {
                            sure=sure-120;
                            masaacilis=54+sure4;
                            System.out.println(masaacilis);   
                                
                            }
    HATAM = 30 ve 60 arası her 2.5 dakika için 1 ekliyor
    
    
    // farklı yazım türü
    
        Scanner klavye = new Scanner(System.in);
                int masaacilis= 30;   
                System.out.println("Kaç dakikka zaman harcadın?");
                int sure= klavye.nextInt();

                        if (sure<30) {
                            System.out.println(masaacilis);         
                        }  else if (sure<60) {
                            sure=sure-30;
                            masaacilis=30+(int) (sure/5)*2;
                            System.out.println(masaacilis);   
                                
                            }
                      else    if (sure<120) {
                            sure=sure-60;
                            masaacilis=42+(int)(sure/5);
                            System.out.println(masaacilis);   
                                
                            }
                         else   if (sure>120) {
                            sure=sure-120;
                            masaacilis=54+ (int)(sure/10);
                            System.out.println(masaacilis);   
                                
                            }
  
*/
    
            public static void main(String[] args) {
      /*
                // - Bir internet kafede masa açılış ücreti 20 TL olarak belirlenmekte ve 0-30 dk arası ücretlendirme 
değişmemektedir. 30-60 dk için her 5 dakikada 2 TL ücret farkı yansımaktadır. 60-120 dk arası her 5 
dakikada 1 TL ücret farkı yansımaktadır. 120 dk’dan sonra ise her 10 dk’da 1 TL ücret farkı 
yansımaktadır. Bu durumda müşterilerin kaç dakika zaman harcama bilgisine göre ödemesi gereken 
ücreti hesaplayan kodu yazınız
        */
    Scanner klavye = new Scanner(System.in);
                int masaacilis= 30;   
                System.out.println("Kaç dakikka zaman harcadın?");
                int sure= klavye.nextInt();

                        if (sure<30) {
                            System.out.println(masaacilis);         
                        }  else if (sure<60) {
                                
                            
                            sure=sure-30;
                            masaacilis=32+(int) (sure/5)*2;                        
                            System.out.println(masaacilis);   
                                
                            }
                      else    if (sure<120) {
                            sure=sure-60;
                            masaacilis=44+(int)(sure/5);
                            System.out.println(masaacilis);   
                                
                            }
                         else   if (sure>120) {
                            sure=sure-120;
                            masaacilis=56+ (int)(sure/10);
                            System.out.println(masaacilis);   
                                
                            }
  //                             if (sure%5!=0) { 5 ile bölündüğünde kalan 0 değilse alt sayıya yuvarla

                }
                  
                }



