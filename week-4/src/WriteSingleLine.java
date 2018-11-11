import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        try{
            List<String> name = new ArrayList<>();
            name.add ("Zsolt Jenofi");
            name.add("Petra Schrantz");

            Path path = Paths.get("myname.txt");
            Files.write(path, name);

            System.out.println(Files.readAllLines(path));
        }catch (Exception e){
            System.out.println("Valami");
        }
    }
}
