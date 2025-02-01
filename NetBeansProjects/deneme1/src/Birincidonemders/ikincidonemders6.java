
package Birincidonemders;

/*
// Dikdörtgen ve çemberin alanı (interface)

interface sekil {
    void ciz();
    double alan();
}
class dikdortgen implements sekil {
    int length , width;
    dikdortgen(int length, int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public void ciz() {
        System.out.println("---");
       }

    @Override
    public double alan() {
        System.out.println("---");
        return (double)(length*width);
      }
}
class cember implements sekil{
    double pi=3.14;
    int radius;

    public cember(int radius) {
        this.radius = radius;
    }

    @Override
    public void ciz() {
        System.out.println("-----");
     }

    @Override
    public double alan() {
        System.out.println("---");
        return (double)(pi*radius*radius);
      }
}

public class ikincidonemders6 {
    public static void main(String[] args) {
        sekil rect = new dikdortgen(2, 3);
        System.out.println("Dikdörtgenin alanı : " + rect.alan());
        sekil c= new cember(2);
        System.out.println("Çemberin alanı : "+c.alan());
    }
}



//Kutunun içine ekleyip çıkarma
interface intyigit{
    void push(int item);         //push ekleme    item=veri
    int pop ();                         //pop = çıkar
}
class sabityigit implements intyigit{
    private int stack[];
    private int toc;
    sabityigit(int size){
        stack =new int [size];
        toc=-1;
    }

    @Override
    public void push(int item) {
        if (toc==stack.length-1) {
            System.out.println("Stack yigit dolu");
        } else {
            stack[++toc]=item;
        }
    }

    @Override
    public int pop() {
        if (toc<0) {
            System.out.println("Stack boş");
            return 0;
        } else {
            return stack[toc--];
        }
     }
}
public class ikincidonemders6 {
    public static void main(String[] args) {
        sabityigit s1=new sabityigit(5);
       sabityigit s2=new sabityigit(8);
       sabityigit s3=new sabityigit(10);
        for (int i = 0; i < 5; i++)s1.push(i);
        for (int i = 0; i < 8; i++)s2.push(i);
        for (int i = 0; i < 10; i++)s3.push(i);
        System.out.println("Stack 1 deki elemanlar");
        for (int i = 0; i < 5; i++) {
        System.out.println(s1.pop()+ "  ");}
        System.out.println("Stack 2 deki elemanlar");
        for (int i = 0; i < 8; i++){
            System.out.println(s2.pop()+ "  ");}
        System.out.println("Stack 3 deki elemanlar");
          for (int i = 0; i < 10; i++) {
          System.out.println(s3.pop()+ "  ");}
  
        }
    }


*/

public class ikincidonemders6 {
    
}
