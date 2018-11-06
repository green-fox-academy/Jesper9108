import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentCounter {
    public static void main(String[] args) {
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Theodor");
        row0.put("age", 9);
        row0.put("candies", 2);
        map.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add(row5);

        // Who has got more than 4 candies?


        //
        ArrayList<Object> candyNames = new ArrayList<>();
        double sumAge = 0;


        // Iterating through initial arraylist in order to find who has more than 4 candies
        for (int i = 0; i < map.size(); i++) {
            Map<String, Object> tempHashMap = new HashMap<>();
            tempHashMap = map.get(i);

            int tempCandy = (int) tempHashMap.get("candies");

            if (tempCandy >= 4) {
                candyNames.add(tempHashMap.get("name"));
            }
        }

        // Iterating through initial arraylist in order to find the sum of age of people who have less than 5 candies
        for (int i = 0; i < map.size(); i++) {
            Map<String, Object> tempHashMap = new HashMap<>();
            tempHashMap = map.get(i);

            int tempAge = (int) tempHashMap.get("age");
            int tempCandy = (int) tempHashMap.get("candies");

            if (tempCandy < 5) {
                sumAge = sumAge + tempAge;
            }
        }

        // Printing information to console
        System.out.println("Name of people, who have more than 4 candies: ");
        for (int i = 0; i < candyNames.size(); i++) {
            System.out.println(candyNames.get(i));
        }
        System.out.println();
        System.out.println("The age of people, who have less than 5 candies: " + sumAge);

    }


}
