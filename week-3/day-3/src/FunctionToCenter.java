import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.


        ArrayList<Integer> xCoordinates = new ArrayList<>();
        ArrayList<Integer> yCoordinates = new ArrayList<>();

        for (int i = 0; i < WIDTH + 1; i += 20) {
            xCoordinates.add(i);
            yCoordinates.add(i);
        }

        linesCenter(graphics, xCoordinates, yCoordinates);
    }

    public static void linesCenter(Graphics graphics, ArrayList<Integer> xCoordinates, ArrayList<Integer> yCoordinates) {

        for (int i = 0; i < xCoordinates.size(); i++) {
            graphics.drawLine(xCoordinates.get(i), 0, WIDTH / 2, HEIGHT / 2);
            graphics.drawLine(WIDTH / 2, HEIGHT / 2, WIDTH, yCoordinates.get(i));
            graphics.drawLine(xCoordinates.get(i), HEIGHT, WIDTH / 2, HEIGHT / 2);
            graphics.drawLine(0, yCoordinates.get(i), WIDTH / 2, HEIGHT / 2);
        }

    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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