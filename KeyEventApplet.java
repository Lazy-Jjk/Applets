import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventApplet extends JFrame implements KeyListener {
    String msg = "";

    KeyEventApplet() {
        setSize(300, 150);
        setTitle("Key Events");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        msg = "Pressed: " + e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        msg = "Released: " + e.getKeyChar();
        repaint();
    }

    public void keyTyped(KeyEvent e) {
        msg = "Typed: " + e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(msg, 80, 100);
    }

    public static void main(String[] args) {
        new KeyEventApplet();
    }
}
