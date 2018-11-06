import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numLives = 5;

        int numRandom = ThreadLocalRandom.current().nextInt(1, 101);
        //int numRandom = 10;

        System.out.println("I have a number between 1 and 100. You have " + numLives + " lives.");

        for (int i = numLives - 1; i >= 0; i--) {
            int numGuess = scanner.nextInt();

            if (numGuess == numRandom) {
                System.out.println("Congrats! You have found the number.");
                break;
            }

            if (numGuess > numRandom && i != 0) {
                System.out.println("Too high. You have " + (i) + " lives left");
            }

            if (numGuess < numRandom && i != 0) {
                System.out.println("Too low. You have " + (i) + " lives left");
            }

            if (i == 0) {
                System.out.println(" ): You could not find the number. It was " + numRandom + ". Try again!");
            }

        }
    }
}
