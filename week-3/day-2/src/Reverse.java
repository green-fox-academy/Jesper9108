public class Reverse {
    public static void main(String[] args) {

        System.out.println(reverse(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI"));
    }

    public static String reverse(String textInput) {
        String reversed = "";
        for (int i = textInput.length() - 1; i >= 0; i--) {
            reversed = reversed + textInput.charAt(i);
        }
        return reversed;
    }
}
