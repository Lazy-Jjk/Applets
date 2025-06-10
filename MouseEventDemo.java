import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame implements MouseListener {
    String msg = "";

    MouseEventDemo() {
        setSize(300, 150);
        setTitle("Mouse Events");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(this);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(msg, 80, 100);
    }

    public void mouseClicked(MouseEvent e) {
        msg = "Clicked";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        msg = "Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        msg = "Released";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        msg = "Entered";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        msg = "Exited";
        repaint();
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
