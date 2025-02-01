
package ders.çalışma;


import java.util.logging.Level;
import java.util.logging.Logger;

class birkereisim2keresoyisim extends Thread{
    public void run(){
        for(int i=0;i<800;i++){
            System.out.println("rumi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
              
            }
            System.out.println("bulut");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            
            }
        }
    }
}

/* devamı

public class Mavenproject5 {

    public static void main(String[] args) throws InterruptedException {
   
    A x=new A();
    x.start();
        
        }
}
*/