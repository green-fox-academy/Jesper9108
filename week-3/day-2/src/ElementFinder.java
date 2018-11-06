import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(containsSeven(arrayList));
    }

    public static String containsSeven(ArrayList<Integer> userInput) {
        String answer = "Noooooo";
        for (int i = 0; i < userInput.size(); i++) {
            if (userInput.get(i) == 7) {
                answer = "Hoorray!";
            }
        }
        return answer;
    }

}
