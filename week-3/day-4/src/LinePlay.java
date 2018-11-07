import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics) {

        ArrayList<Integer> xCo = new ArrayList<>();
        ArrayList<Integer> yCo = new ArrayList<>();

        int align = 10; //adjusting the number of lines


        //setting up the coordinates for lines
        for (int i = align; i < WIDTH - align; i += align) {
            xCo.add(i);
            yCo.add(i);
        }

        //drawing of lines
        for (int i = 0; i < xCo.size(); i++) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(xCo.get(i), 0, WIDTH, yCo.get(i));
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, yCo.get(i), xCo.get(i), HEIGHT);
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