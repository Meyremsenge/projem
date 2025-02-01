
package ders.çalışma;

import javax.swing.*;  
import java.awt.*;  

public class sinxGraph extends JFrame {  

    public sinxGraph() {  
        setTitle("sin(x) Grafiği");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setSize(800, 600);  
        setVisible(true);  
    }  

    public void paint(Graphics g) {  
        super.paint(g);  
        Graphics2D g2 = (Graphics2D) g;  
        int w = getWidth();  
        int h = getHeight();  

        g2.translate(0, h/2);                                               // Origo'yu ekranın ortasına al  

        g2.setColor(Color.BLUE);  
        
        double scale = 50; // Ölçek  
        double yOld = Math.sin(0) * scale;                      // x = 0 için y değeri  
        for (double x = 0; x < w; x++) {  
            double y = Math.sin(x / scale) * scale;                // sin(x) değeri hesapla  
            g2.drawLine((int)(x-1), (int)yOld, (int)x, (int)y);  // Önceki x ve y ile şimdiki x ve y arasında çizgi çiz  
            yOld = y;  
        }  
    }  

    public static void main(String[] args) {  
        new sinxGraph();  
    }  
}

