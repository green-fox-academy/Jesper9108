import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chicken(s) are there?");
        int numChicken = scanner.nextInt();

        System.out.println("How many pigs are there?");
        int numPig = scanner.nextInt();

        int legsTotal = numChicken * 2 + numPig * 4;

        System.out.println(" There are a total of " + legsTotal + " legs.");
    }
}
