import java.util.Scanner;

public class ParametricAverage {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            // Asking for the amount of number to be used
            System.out.println("Please enter how many numbers you would like to manage:");
            int userIni = scanner.nextInt();

            //
            double Sum = 0;

            //looping through the number(s) of the user
            for (int i = 1; i < userIni + 1; i++) {
                System.out.println("Please enter number " + i);
                double userNum = scanner.nextDouble();

                Sum += userNum; //summing the numbers inside the loop
            }
            ;

            double Average = Sum / userIni; //calculating the average of the number(s)

            System.out.println("Sum: " + Sum + ", Average: " + Average + "\n");
        }




    }
}
