import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics) {

        int xPos = 0;
        int yPos = 0;

        int size = WIDTH / 10;
        int move = size;
        int numRow = WIDTH / size;
        int numColumn = numRow;

        int countRow = 0;

        while (countRow < numRow) {

            for (int i = 0; i < numRow; i++) {
                Lineplay(graphics, xPos, yPos, size);
                xPos += move;
                size += move;
            }


            countRow++;
        }


    }

    public static void Lineplay(Graphics graphics, int cornerX, int cornerY, int size) {

        ArrayList<Integer> xCo = new ArrayList<>();
        ArrayList<Integer> yCo = new ArrayList<>();

        //setting up the coordinates for lines
        for (int i = 0; i < size; i += 10) {
            xCo.add(i);
            yCo.add(i);
        }

        //drawing of lines
        for (int i = 0; i < xCo.size(); i++) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(xCo.get(i), cornerY, size, yCo.get(i));
            graphics.setColor(Color.GREEN);
            graphics.drawLine(cornerX, yCo.get(i), xCo.get(i), size);
        }
    }
    //graphics.setColor(Color.MAGENTA);
    //graphics.drawLine(xCo.get(i), cornerY, size, yCo.get(i));
    //graphics.setColor(Color.GREEN);
    //graphics.drawLine(cornerX, yCo.get(i), xCo.get(i), size);

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