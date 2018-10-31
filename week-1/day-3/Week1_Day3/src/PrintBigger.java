import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     while(true) {
         System.out.println("Please enter your first number");
         double numUser1 = scanner.nextDouble();

         System.out.println("Please enter your second number");
         double numUser2 = scanner.nextDouble();

         if (numUser1 < numUser2) {
             System.out.println("The bigger number is: " + numUser2);
         } else {
             System.out.println("The bigger number is: " + numUser1);
         }
         ;
     }
    }
}
