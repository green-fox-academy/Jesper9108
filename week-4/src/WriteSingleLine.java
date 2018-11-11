import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        try {
            List<String> names = new ArrayList<>();
            names.add("Zsolt Jenofi");
            names.add("Petra Schrantz");
            

            Path path = Paths.get("myname.txt");

            if (Files.isWritable(path)) {
                Files.write(path, names);
            }

            System.out.println(Files.readAllLines(path));
        } catch (Exception e) {
            System.out.println("Unable to write file: myname.txt");
        }
    }
}
