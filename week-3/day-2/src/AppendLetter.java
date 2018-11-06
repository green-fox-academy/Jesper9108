import java.util.Arrays;
import java.util.List;

public class AppendLetter {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        appendA(far);

    }

    public static void appendA(List<String> userInput) {
        for (int i = 0; i < userInput.size(); i++) {
            userInput.set(i, userInput.get(i) + "a");
        }
        System.out.println(userInput);
    }
}
