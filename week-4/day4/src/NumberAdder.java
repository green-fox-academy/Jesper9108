public class NumberAdder {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.print(adder(i) + ", ");
        }
    }

    public static int adder(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + adder(n - 1);
        }
    }
}