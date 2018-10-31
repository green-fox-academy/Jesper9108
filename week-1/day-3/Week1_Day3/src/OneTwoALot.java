import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number");
        int numIni = scanner.nextInt();

        if (numIni <= 0){
            System.out.println("Not enough");
        } else if ( numIni == 1){
            System.out.println("One");
        } else if ( numIni == 2){
            System.out.println("Two");
        } else if (numIni > 2){
            System.out.println("A lot");
        };
    }
}
