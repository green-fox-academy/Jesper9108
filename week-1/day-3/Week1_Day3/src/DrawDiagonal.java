import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();

        for (int i =0; i < lines; i++){
            if ( i == 0 || i == lines-1){
                for (int j = 0; j < lines; j++){
                    System.out.print("%");
                }
            }
            else {
                System.out.print("%");

                for (int j=1; j < lines-1; j++){
                    if (j == i){
                        System.out.print("%");
                    }
                    else {System.out.print(" ");
                    }
                }

                System.out.print("%");
            }
            System.out.println();
        }
    }
}
