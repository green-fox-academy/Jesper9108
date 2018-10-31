import java.util.Scanner;

public class GuessTheNumber {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int numIni = 12; //declaring the number to be guessed

        System.out.println("Please guess a number");
        int numGuess = scanner.nextInt();

        while ( numIni != numGuess){
            if (numGuess < numIni){
                System.out.println("The initial number is higher ");
            } else {
                System.out.println("The initial number is lower");
            };
            System.out.println("Please guess again!");
            numGuess =scanner.nextInt();
        };

        System.out.println("You guessed right, the number is: " + numIni);





    }
}
