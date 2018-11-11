import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {

        LineWriter("myfile.txt", "asd", 5);

    }

    public static void LineWriter(String PathOfFile, String word, Integer number) {

        List<String> listWords = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            listWords.add(word);
        }

        Path path = Paths.get(PathOfFile);

        try {
            Files.write(path, listWords);
        } catch (IOException e) {
            System.out.println("The file does not exist");
        }
    }
}
