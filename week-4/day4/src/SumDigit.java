public class SumDigit {

    public static void main(String[] args) {

        System.out.println(sumdigit(1275));
    }


    private static int sumdigit(int num) {
        if (num  == 0) {
            return 0;
        } else {
            return num % 10 + sumdigit(num/10);
        }

    }


}
