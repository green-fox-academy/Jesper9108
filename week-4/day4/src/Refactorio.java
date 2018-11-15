public class Refactorio {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(refactorio(i));
        }
    }

    private static double refactorio(double input) {
        if (input == 0) {
            return 0;
        } else if (input == 1) {
            return 1;
        } else {
            return input * refactorio(input - 1);
        }
    }
}
