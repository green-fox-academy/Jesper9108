import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPyramid = scanner.nextInt();

        String k = "*";

        for (int i = 0; i < numPyramid; i++){
            for (int j = 0; j < numPyramid - i; j++){
                System.out.print(" ");
            }
                System.out.println(k);
                k += "**";

        }
    }
}
