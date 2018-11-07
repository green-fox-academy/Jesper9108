import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics) {

        int align = 10;

        ArrayList<Integer> xCoordinates = new ArrayList<>();
        ArrayList<Integer> yCoordinates = new ArrayList<>();

        for (int i = align; i < WIDTH - align + 1; i += align) {
            xCoordinates.add(i);
            yCoordinates.add(i);
        }

        for (int i = 0; i < xCoordinates.size(); i++) {
            graphics.setColor(Color.GREEN);
            if (xCoordinates.get(i) <= WIDTH / 2) {
                graphics.drawLine(xCoordinates.get(i), HEIGHT / 2, WIDTH / 2, HEIGHT / 2 - yCoordinates.get(i));
                graphics.drawLine(xCoordinates.get(i), HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + yCoordinates.get(i));
            } else {
                graphics.drawLine(WIDTH / 2, yCoordinates.get(i) - HEIGHT / 2 , xCoordinates.get(i), HEIGHT / 2);
                graphics.drawLine(WIDTH / 2, yCoordinates.get(i), WIDTH - xCoordinates.get(i) + WIDTH / 2, HEIGHT / 2);
            }

        }


    }

    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

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