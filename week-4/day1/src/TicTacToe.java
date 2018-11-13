import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {

        winnerOf("win-x.txt");

    }

    public static void winnerOf(String filename) {
        Path path = Paths.get(filename);


        int counterO = 0;
        int counterX = 0;
        String result;


        try {

            List<String> TicTacToeMatch = Files.readAllLines(path);
            for (int i = 0; i < TicTacToeMatch.size(); i++) {

                String line = TicTacToeMatch.get(i);


                for (int j = 0; j < line.length(); j++) {
                    if (line.charAt(j) == 'X') {
                        counterX++;
                    } else {
                        counterO++;
                    }
                }
            }

            if (counterO == counterX) {
                result = "Draw";
            } else if (counterO > counterX) {
                result = "O";
            } else {
                result = "X";
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
