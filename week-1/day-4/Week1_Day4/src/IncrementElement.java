public class IncrementElement {
    public static void main(String[] args) {

        int[] t = {1, 2, 3, 4, 5};
        t[2] = ++t[2];

        System.out.println(t[2]);
    }
}
