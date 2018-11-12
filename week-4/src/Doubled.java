import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {

        doubled("doubled.txt");
    }

    private static void doubled(String filename) {

        Path path = Paths.get(filename);
        try {
            List<String> text = Files.readAllLines(path);

            for (int i = 0; i < text.size(); i++) {

                String line = text.get(i);
                String noDoubles = "";

                for (int j = 0; j < line.length(); j += 2) {
                    noDoubles += (line.charAt(j));
                }

                System.out.println(noDoubles);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
