import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {

        reverse("reversedlines.txt");

    }

    public static void reverse(String filename) {

        Path path = Paths.get(filename);
        try {
            List<String> text = Files.readAllLines(path);


            for (int i = 0; i < text.size(); i++) {

                String temp = text.get(i);
                String tempReverse = new StringBuffer(temp).reverse().toString();

                System.out.println(tempReverse);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
