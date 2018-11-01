import java.util.ArrayList;

public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("https", "https:");

        url = url.replace("bots", "odds");

        System.out.println(url);


    }
}
