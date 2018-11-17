package Fractals;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        drawGrid(graphics, WIDTH / 2 - WIDTH / 4, HEIGHT / 2 - HEIGHT / 4, WIDTH / 2, HEIGHT / 2, 4);


    }

    public static void drawGrid(Graphics graphics, int x, int y, int width, int height, int level) {

        graphics.setColor(Color.YELLOW);
        graphics.drawRect(x, y, width, height);

        if (level > 0) {
            drawGrid(graphics, x - width / 4, y - height / 4, width / 2, height / 2, level - 1);
            drawGrid(graphics, x + width - width / 4, y - height / 4, width / 2, height / 2, level - 1);
            drawGrid(graphics, x - width / 4, y + height - height / 4, width / 2, height / 2, level - 1);
            drawGrid(graphics, x + width - width / 4, y + height - height / 4, width / 2, height / 2, level - 1);
        }
    }


    static int WIDTH = 500;
    static int HEIGHT = 500;

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