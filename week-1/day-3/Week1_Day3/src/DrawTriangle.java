import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

     while (true) {
         System.out.println("What size the triangle should be?");
         int numSize = scanner.nextInt();
         String k = "*";

         for (int i = 1; i < numSize + 1; i++) {
             System.out.println(k);
             k += "*";
         }
         ;
     }
    }

}
