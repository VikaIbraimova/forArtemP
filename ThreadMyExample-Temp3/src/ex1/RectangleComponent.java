package ex1;

import javax.swing.JComponent;
import java.awt.Graphics;

public class RectangleComponent extends JComponent /*implements Runnable*/ {

    @Override
    protected void paintComponent(Graphics g) {
        super.printComponent(g);
        int gap = 0;
        g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);

    }

/*    @Override
    public void run() {
        while (true){
            //Закрышиваем квадрат
            //????
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/
}

/*class MyThread implements Runnable{
    private RectangleComponent rectangleComponent;
    private volatile boolean isStopped = false;

    @Override
    public void run() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}*/
