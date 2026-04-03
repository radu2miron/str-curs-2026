package edu.tucn.str.lecture1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Win extends JFrame {
    public Win() {
        setTitle("My first window");
        setSize(400, 300);
        setLocation(new Random().nextInt(1024), new Random(512).nextInt());
        JButton but = new JButton("Click to close!");

        but.addActionListener(e -> new Win().setVisible(true));

        add(but);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Win win = new Win();
        win.setVisible(true);
    }
}
