import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String partAdd = "always takes longer than";

        List<String> quoteConverted = new LinkedList<>(Arrays.asList(quote.split(" ")));
        List<String> partAddConverted = new LinkedList<>(Arrays.asList(partAdd.split(" ")));


        quoteConverted.addAll(quoteConverted.indexOf("It")+1 , partAddConverted);

        quote = String.join(" ", quoteConverted);

        System.out.println(quote);


    }
}
