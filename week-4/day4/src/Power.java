public class Power {

    public static void main(String[] args) {

        System.out.println(powerN(5, 4));

    }


    public static int powerN(int base, int power) {

        if (power == 0) {
            return 1;
        } else {
            return base * powerN(base,power - 1);
        }
    }
}
