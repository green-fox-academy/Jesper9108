import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

    public static void mainDraw(Graphics graphics) {

        int lengthSide = 20;
        int maxTriangles = WIDTH / lengthSide;

        int startPosXini = 0;
        int startPosY = HEIGHT;


        while (maxTriangles > 0) {

            int startPosX = startPosXini;
            for (int i = 0; i < maxTriangles; i++) {
                Triangle(graphics, lengthSide, startPosX, startPosY);
                startPosX += lengthSide;
            }
            startPosXini += lengthSide / 2;
            startPosY -= lengthSide;
            --maxTriangles;
        }


    }

    public static void Triangle(Graphics graphics, int length, int startX, int startY) {
        graphics.drawLine(startX, startY, startX + length, startY);
        graphics.drawLine(startX + length, startY, startX + length - length / 2, startY - length);
        graphics.drawLine(startX + length - length / 2, startY - length, startX, startY);
    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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