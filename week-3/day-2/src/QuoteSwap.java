import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create", "I", "cannot", "not", "understand."));

        quoteswap(list);

    }

    public static void quoteswap(ArrayList<String> list) {
        ArrayList<String> temp = new ArrayList<>(Arrays.asList(list.get(2)));
        list.set(2, list.get(5));
        list.set(5, temp.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
