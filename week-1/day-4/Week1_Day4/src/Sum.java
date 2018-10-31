import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int userNumber = scanner.nextInt();

            System.out.println(sum(userNumber));
        }

    }

    public static int sum (int num){
        int result = 0;
        for (int i=0; i < num+1; i++){
          result += i;
        }
        return result;
    }
}
