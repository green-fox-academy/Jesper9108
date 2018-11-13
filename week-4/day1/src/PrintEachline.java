import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PrintEachline {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("myfile.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0));

        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }

    }
}
