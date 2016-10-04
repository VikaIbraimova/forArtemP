package ex3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

class MyFrame extends JFrame {
    public MyFrame(){
        // создаем  панель.
        JPanel p = new JPanel();
        //jf.add(p);
        add(p);

        // к панели добавляем менеджер GridLayout и устанавливаем размеры таблицы 2*2.
        p.setLayout(new GridLayout(2,2));

        // к панели добавляем кнопку и устанавливаем для нее менеджер в верхнее расположение.
       /* p.add(new JButton("start 2"));
        p.add(new JButton("start 2"));

        p.add(new JButton("start 4"));
        p.add(new JButton("start 5"));*/

        JPanel jp1 = new JPanel();
        p.add(jp1);
        //jp1.setLayout(new FlowLayout());
        jp1.setLayout(new GridLayout(2,2));
        /*jp1.add(new JButton("start 11"));
        jp1.add(new JButton("start 12"));
        jp1.add(new JButton("start 10"));
        jp1.add(new JButton("start *"));*/
        RectangleComponent rc1 = new RectangleComponent();
        jp1.add(rc1);
        /*jp1.add(new JComponent()  {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
                g.setColor(Color.BLUE);
                g.fillRect(gap+1, gap+1, (getWidth() - 2*gap)-1, (getHeight() - 2*gap)-1);
            }
        });*/
        /*jp1.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp1.add(rc1);
        /*jp1.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp1.add(rc1);
        //jp1.add(new JButton("start *"));
        /*jp1.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp1.add(rc1);
        JPanel jp2 = new JPanel();
        p.add(jp2);
        //jp1.setLayout(new FlowLayout());
        jp2.setLayout(new GridLayout(2,2));
        /*jp2.add(new JButton("start 9"));
        jp2.add(new JButton("start *"));
        jp2.add(new JButton("start 8"));
        jp2.add(new JButton("start 7"));*/
       /* jp2.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp2.add(rc1);
        //jp2.add(new JButton("start *"));
        /*jp2.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp2.add(rc1);
        /*jp2.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp2.add(rc1);
        /*jp2.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp2.add(rc1);

        JPanel jp3 = new JPanel();
        p.add(jp3);
        //jp1.setLayout(new FlowLayout());
        jp3.setLayout(new GridLayout(2,2));
        /*jp3.add(new JButton("start 1"));
        jp3.add(new JButton("start 2"));
        jp3.add(new JButton("start *"));
        jp3.add(new JButton("start 3"));*/
      /*  jp3.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp3.add(rc1);
        /*jp3.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp3.add(rc1);
        //jp3.add(new JButton("start *"));
       /* jp3.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp3.add(rc1);
        /*jp3.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp3.add(rc1);

        JPanel jp4 = new JPanel();
        p.add(jp4);
        //jp1.setLayout(new FlowLayout());
        jp4.setLayout(new GridLayout(2,2));
       /* jp4.add(new JButton("start *"));
        jp4.add(new JButton("start 4"));
        jp4.add(new JButton("start 6"));
        jp4.add(new JButton("start 5"));*/
        //jp4.add(new JButton("start *"));
      /*  jp4.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp4.add(rc1);
        /*jp4.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp4.add(rc1);
        /*jp4.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp4.add(rc1);
        /*jp4.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int gap = 0;
                g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
            }
        });*/
        jp4.add(rc1);
    }
}
