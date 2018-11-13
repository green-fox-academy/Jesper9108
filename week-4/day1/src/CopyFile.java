import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {

        System.out.println(copyFile("reversedorder.txt", "copyfile.txt"));


    }

    public static boolean copyFile(String copy, String to) {

        boolean stateofCopy;
        Path pathCopy = Paths.get(copy);
        Path pathTo = Paths.get(to);

        try {
            List<String> buffer = Files.readAllLines(pathCopy);
            Files.write(pathTo, buffer);

            stateofCopy = true;

        } catch (IOException e) {
            stateofCopy = false;
        }

        return stateofCopy;

    }
}


