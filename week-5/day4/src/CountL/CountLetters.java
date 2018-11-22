package CountL;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public CountLetters() {

    }

    public Map<Character, Integer> letterCounter(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char actual = text.charAt(i);
            if (!map.containsKey(actual)) {
                map.put(actual, 0);
            }
            map.put(actual, map.get(actual) + 1);
        }
        return map;
    }
}
