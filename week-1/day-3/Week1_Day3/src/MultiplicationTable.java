import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number to be multiplied");
        int numIni = scanner.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(numIni * i);
        };
    }
}


