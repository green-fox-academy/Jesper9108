public class SumAll {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};
        int sum = 0;

        for (int i = 0; i < ai.length; i++){
            sum += ai[i];
        }

        System.out.println("The sum of the elements of array 'ai': " +sum);
    }
}
