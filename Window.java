package Tetris;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;

public class Window {
    public static void main(String[] args) {
        JFrame window = new JFrame("Тетис");
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout(1, 1));
        Canvas canv = new Canvas();
        window.add(canv);
        window.setVisible(true);
    }

    private static class Canvas extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setPaint(Color.BLACK);
            for (int i =0; i<180;i+=10)
            g2d.fillRect(180, i, 10, 10);//  вот туточки я замыслил страшное -  и какбэ обломалси.
            super.repaint();
        }
    }
}
