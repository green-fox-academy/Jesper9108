public class Bunny2 {

    public static void main(String[] args) {

        System.out.println(bunnyEarCounter(9));
    }

    private static int bunnyEarCounter(int bunnynumber) {
        if (bunnynumber == 0) {
            return 0;
        } else {
            if (bunnynumber % 2 != 0) {
                return 2 + bunnyEarCounter(bunnynumber - 1);
            } else {
                return 3 + bunnyEarCounter(bunnynumber - 1);
            }
        }
    }
}

