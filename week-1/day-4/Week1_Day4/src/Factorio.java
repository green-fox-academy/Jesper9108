import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the number to be factorized!");
            int userInput = scanner.nextInt();

            System.out.println(factorio(userInput));
        }


    }

    public static int factorio (int num){
        int factor = 1;
        for (int i = 1; i < num+1; i++){
            factor *= i;
        }
        return factor;
    }
}
