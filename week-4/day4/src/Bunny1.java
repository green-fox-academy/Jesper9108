public class Bunny1 {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            System.out.println(bunnyEars(i));
        }

    }

    public static int bunnyEars(int bunnynumber) {

        if (bunnynumber == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnynumber - 1);
        }
    }
}
