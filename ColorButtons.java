import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorButtons extends JFrame implements ActionListener {
    JButton red = new JButton("Red"), yellow = new JButton("Yellow"), blue = new JButton("Blue");

    ColorButtons() {
        setLayout(new FlowLayout());
        add(red); add(yellow); add(blue);
        red.addActionListener(this);
        yellow.addActionListener(this);
        blue.addActionListener(this);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        getContentPane().setBackground(cmd.equals("Red") ? Color.RED :
                                       cmd.equals("Yellow") ? Color.YELLOW : Color.BLUE);
    }

    public static void main(String[] args) {
        new ColorButtons();
    }
}
