import javax.swing.*;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            int x = rand.nextInt(200);
            int y = rand.nextInt(200);
            int width = rand.nextInt(100);
            int height = rand.nextInt(120);
            int numColor1 = rand.nextInt(256);
            int numColor2 = rand.nextInt(256);
            int numColor3 = rand.nextInt(256);

            graphics.setColor(new Color(numColor1, numColor1, numColor3));
            graphics.fillRect(x, y, width, height);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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