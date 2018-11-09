import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters_proper {

    public static void mainDraw(Graphics graphics) {

        //Lineplay(graphics, 0, 0, 200);

        int xCoordinate = 0;
        int yCoordinate = 0;
        int sideLength = WIDTH/15;

        int numRow = WIDTH / sideLength;
        int numColumn = numRow;

        int counter = 0;

        while (counter < numColumn) {

            for (int i = 0; i < numRow; i++) {
                Lineplay(graphics, xCoordinate, yCoordinate, sideLength, 10);

                xCoordinate+= sideLength;
            }

            xCoordinate = 0;
            yCoordinate += sideLength;

            counter++;
        }

    }

    public static void Lineplay(Graphics graphics, int cornerX, int cornerY, int size, int numberLines) {
        int xStart = cornerX;
        int yStart = cornerY;
        int xEnd = cornerX + size;
        int yEnd = cornerY + size / 10;

        for (int i = 0; i < numberLines; i++) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(xStart, yStart, xEnd, yEnd);
            xStart += size / 10;
            yEnd += size / 10;
        }
        xStart = cornerX;
        yStart = cornerY;
        xEnd = cornerX + size / 10;
        yEnd = cornerY + size;

        for (int i = 0; i < numberLines; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(xStart, yStart, xEnd, yEnd);

            yStart += size / 10;
            xEnd += size / 10;
        }
    }


    // Don't touch the code below
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