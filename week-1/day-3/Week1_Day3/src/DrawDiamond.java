import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
        int numDiamond = scanner.nextInt();

        int countChar = 1;
        int countSpace = numDiamond/2;
        int countSpace_R = 1;
        int countChar_R = numDiamond -2;


            if (numDiamond % 2 != 0) {
                for (int height = 0; height < numDiamond; height++) {
                    if (height <= numDiamond / 2) {
                        for (int i = 0; i < countSpace; i++) {
                            System.out.print(" ");
                        }
                        for (int i = 0; i < countChar; i++) {
                            System.out.print("*");
                        }
                        countSpace--;
                        countChar += 2;
                        System.out.println();
                    } else {
                        for (int i = 0; i < countSpace_R; i++) {
                            System.out.print(" ");
                        }
                        for (int i = 0; i < countChar_R; i++) {
                            System.out.print("*");
                        }
                        countSpace_R++;
                        countChar_R -= 2;
                        System.out.println();
                    }
                }
            } else {
                System.out.println("Please enter an odd number!");
            }
        }
    }
}
