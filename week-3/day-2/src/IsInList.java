import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(checkNums(list));

    }

    public static Boolean checkNums(ArrayList<Integer> userList) {
        ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        Boolean checker = userList.containsAll(elements);

        return checker;
    }
}
