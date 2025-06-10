import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBScrollMini extends JFrame implements AdjustmentListener {
    JScrollBar r = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
    JScrollBar g = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
    JScrollBar b = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
    JLabel label = new JLabel("Color Preview", JLabel.CENTER);

    RGBScrollMini() {
        setLayout(new GridLayout(4, 1));
        add(r);
        add(g);
        add(b);
        add(label);
        r.addAdjustmentListener(this);
        g.addAdjustmentListener(this);
        b.addAdjustmentListener(this);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        Color c = new Color(r.getValue(), g.getValue(), b.getValue());
        label.setForeground(c);
    }

    public static void main(String[] args) {
        new RGBScrollMini();
    }
}
