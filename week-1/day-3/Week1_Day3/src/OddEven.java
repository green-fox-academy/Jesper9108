import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number you would like to check");
        int numCheck = scanner.nextInt();

        if (numCheck % 2 == 0){
            System.out.println("The number (" + numCheck + ") you have given is even");
        } else {
            System.out.println("The number (" + numCheck + ")  you have given is odd");
        };


    }
}
