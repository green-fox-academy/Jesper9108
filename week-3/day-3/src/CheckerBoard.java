import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        graphics.setColor(Color.RED);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        int align = 8;

        int sideLength = WIDTH / align;
        int numRectRow = align / 2;
        int xStartOdd = sideLength;
        int xStartEven = 0;
        int startY = 0;

        int counter = 0;
        while (counter <= HEIGHT) {

            if (counter % 2 == 0) {
                for (int i = 0; i < numRectRow; i++) {
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(xStartEven, startY, sideLength, sideLength);
                    xStartEven += sideLength * 2;
                }
            } else if (counter % 2 != 0) {
                for (int i = 0; i < numRectRow; i++) {

                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(xStartOdd, startY, sideLength, sideLength);
                    xStartOdd += sideLength * 2;
                }
            }

            xStartOdd = sideLength;
            xStartEven = 0;
            startY += sideLength;
            counter++;
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