import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        reverseOrder("reversedorder.txt");

    }

    public static void reverseOrder(String filename) {

        Path paths = Paths.get(filename);

        try {
            List<String> text = Files.readAllLines(paths);

            for (int i = text.size()-1; i > 0; i--) {
                String line = text.get(i);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
