package ex3;

import javax.swing.JComponent;
import java.awt.Graphics;

public class RectangleComponent extends JComponent {
    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        int gap = 0;
        g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
    }
}
