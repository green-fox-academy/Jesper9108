import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {

        System.out.println(subInt(5, Arrays.asList(13, 25, 3, 4, 43, 47, 73)));

    }

    public static ArrayList<Integer> subInt(int sub, List<Integer> listIni) {
        ArrayList<Integer> listIndex = new ArrayList<>();

        for (int i = 0; i < listIni.size(); i++) {
            if (listIni.get(i) % 10 == sub) {
                listIndex.add(i + 1);
            }
        }
        return listIndex;
    }
}
