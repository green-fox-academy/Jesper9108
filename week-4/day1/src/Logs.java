import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Logs {
    public static void main(String[] args) {

        String[] IP = getIPaddress("logs.txt");

        System.out.println(Arrays.toString(IP));

        Ratio("logs.txt");


    }

    public static void Ratio(String filename) { //Method to check the ratio of GET/POST

        Path path = Paths.get(filename);

        try {
            List<String> log = Files.readAllLines(path);

            double countGET = 0;
            double countPOST = 0;
            double ratio = 0;
            for (int i = 0; i < log.size(); i++) {
                //String[] line = log.get(i).split("\\s+");

                String toCheck = log.get(i).split("\\s+")[6];

                if (toCheck.contains("GET")) {
                    countGET++;
                } else {
                    countPOST++;
                }
            }
            ratio = countGET / countPOST;
            System.out.println(ratio);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static String[] getIPaddress(String filename) { //Method to obtain the IP addresses into an array
        Path path = Paths.get(filename);

        String[] IPaddress = new String[0];
        try {
            List<String> logs = Files.readAllLines(path);
            IPaddress = new String[logs.size()];


            for (int i = 0; i < logs.size(); i++) {
                IPaddress[i] = logs.get(i).split("\\s+")[5];
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return IPaddress;

    }


}
