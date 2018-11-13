import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.Arrays.asList;

public class Lottery {
    public static void main(String[] args) {

        LotteryNumbers("lotterydata.txt");
    }

    public static void LotteryNumbers(String filename) {
        Path path = Paths.get(filename);

        Map<String, Integer> lotteryMap = new HashMap();

        try {
            List<String> data = Files.readAllLines(path);

            ArrayList<String> numLottery = new ArrayList<>(); //creating list from all numbers of given file
            for (int i = 0; i < data.size(); i++) {

                List<String> splittedLines = Arrays.asList(data.get(i).split(";"));
                numLottery.addAll(splittedLines.subList(11, 16));
            }

            for (String item : numLottery) {
                if (!lotteryMap.containsKey(item)) {
                    lotteryMap.put(item, 0);
                }
                lotteryMap.put(item, lotteryMap.get(item) + 1);
            }

            System.out.println(lotteryMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
