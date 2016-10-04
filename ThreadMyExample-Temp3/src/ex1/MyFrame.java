package ex1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

class MyFrame extends JFrame {

    //private RectangleComponent timeThread;
    public MyFrame(){
        // создаем  панель.
        JPanel p = new JPanel();
        add(p);

        // к панели добавляем менеджер GridLayout и устанавливаем размеры таблицы 2*2.
        p.setLayout(new GridLayout(2,2));
        RectangleComponent rc1 = new RectangleComponent();
       /* if(rc1 == null) {
            rc1 = new RectangleComponent();

            Thread d = new Thread(rc1);
            d.start();
        }*/
        JPanel jp1 = new JPanel();
        p.add(jp1);
        jp1.setLayout(new GridLayout(2,2));
        jp1.add(rc1);
        jp1.add(rc1);
        jp1.add(rc1);
        jp1.add(rc1);

        JPanel jp2 = new JPanel();
        p.add(jp2);
        jp2.setLayout(new GridLayout(2,2));
        jp2.add(rc1);
        jp2.add(rc1);
        jp2.add(rc1);
        jp2.add(rc1);

        JPanel jp3 = new JPanel();
        p.add(jp3);
        jp3.setLayout(new GridLayout(2,2));
        jp3.add(rc1);
        jp3.add(rc1);
        jp3.add(rc1);
        jp3.add(rc1);

        JPanel jp4 = new JPanel();
        p.add(jp4);
        jp4.setLayout(new GridLayout(2,2));
        jp4.add(rc1);
        jp4.add(rc1);
        jp4.add(rc1);
        jp4.add(rc1);
        /*RectangleComponent rc2 = new RectangleComponent();
        MyThread myThread = new MyThread(rc2);*/
    }
}

