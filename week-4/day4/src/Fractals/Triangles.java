package Fractals;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        drawTriangles(graphics, 0, 0, WIDTH, 3);


    }

    public static void drawTriangles(Graphics graphics, int x, int y, int size, int level) {
        int R, G, B;

        R = (int) (Math.random() * 255 + 1);
        G = (int) (Math.random() * 255 + 1);
        B = (int) (Math.random() * 255 + 1);

        graphics.setColor(new Color(R, G, B));
        graphics.drawLine(x, y, x + size, y);
        graphics.drawLine(x + size, y, x + size / 2, y + size);
        graphics.drawLine(x + size / 2, y + size, x, y);

        if (level > 0) {
            drawTriangles(graphics, x, y, size / 2, level - 1);
            drawTriangles(graphics, x + size / 2, y, size / 2, level - 1);
            drawTriangles(graphics, x + size / 4, y + size / 2, size / 2, level - 1);
        }

    }


    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}


