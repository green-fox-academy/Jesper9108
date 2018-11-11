import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        System.out.println(linecounter("myfile.txt"));

    }

    public static Integer linecounter(String filename) {

        try {
            Path filepath = Paths.get(filename);
            List<String> scan = Files.readAllLines(filepath);
            int size = scan.size();
            return size;

        } catch (Exception e) {
            return 0;
        }


    }
}
