import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {
    public static void main(String[] args) {

        LotteryNumbers("lotterydata.txt");
    }

    public static void LotteryNumbers(String filename) {
        Path path = Paths.get(filename);

        Map<Integer, Integer> LotteryMap = new HashMap();

        try {
            List<String> data = Files.readAllLines(path);

            ArrayList<Integer> numLottery = new ArrayList<>(); //creating list from all numbers of given file
            for (int i = 0; i < data.size(); i++) {
                numLottery.add(Integer.parseInt(data.get(i).split(";")[11]));
                numLottery.add(Integer.parseInt(data.get(i).split(";")[12]));
                numLottery.add(Integer.parseInt(data.get(i).split(";")[13]));
                numLottery.add(Integer.parseInt(data.get(i).split(";")[14]));
                numLottery.add(Integer.parseInt(data.get(i).split(";")[15]));
            }

            System.out.println(numLottery.size());

            ArrayList<Integer> LotteryMapKey = new ArrayList<>();
            ArrayList<Integer> LotteryMapValue = new ArrayList<>();

            for (int i = 1; i < 91; i++) {

                int counter = 0;

                for (int j = 0; j < numLottery.size(); j++) {
                    if (i == numLottery.get(j)) {
                        LotteryMapKey.add(i);
                        break;
                    }
                }

                for (int j = 0; j < numLottery.size(); j++) {
                    if (i == numLottery.get(j)) {
                        counter++;
                    }

                }

                LotteryMapValue.add(counter);
                LotteryMap.put(i, counter);
            }
            System.out.println(LotteryMap);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
