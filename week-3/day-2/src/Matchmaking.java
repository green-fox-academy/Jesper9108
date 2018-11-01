import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        System.out.println(makingMatches( girls, boys));
    }

    public static List<String> makingMatches(List<String> user1, List<String> user2){
        List<String> matched = new LinkedList<>();
        for (int i =0; i < user1.size(); i++){
            matched.add(user1.get(i));
            matched.add(user2.get(i));
        }
        return matched;
    }
}
