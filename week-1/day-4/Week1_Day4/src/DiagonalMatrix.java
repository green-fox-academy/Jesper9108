import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What size the matrix should be?");
        int size = scanner.nextInt();

        int [][] matrix = new int [size] [size];

        for (int i = 0; i < size; i++){
          for (int j = 0; j < size; j++){
              if ( i == j ){
                  matrix[i][j] = 1;
              } else {
                  matrix [i][j] = 0;
              }
              System.out.print(matrix[i][j]);
          }
            System.out.println();
        }


    }


}
