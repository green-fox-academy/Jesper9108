import java.util.Scanner;

public class CountFromTo {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number");
        int num1 = scanner.nextInt();

        System.out.println("Please enter your second number");
        int num2 = scanner.nextInt();

        if ( num1 > num2) {
            System.out.println("The second number should be bigger");
        } else {
            int i = num1;
            for (i = num1; i < num2+1; i++)
                System.out.println(i);
        };

    }
}
