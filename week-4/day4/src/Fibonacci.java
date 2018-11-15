public class Fibonacci {

    public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {
            System.out.print(Fibonacci(i) + ", ");
        }

    }

    private static int Fibonacci(int input) {
        if (input == 1) {
            return 0;
        } else if (input == 2) {
            return 1;
        } else {
            return Fibonacci(input - 2) + Fibonacci(input - 1);
        }
    }
}
