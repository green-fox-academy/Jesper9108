import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {

        System.out.println(subInt(43, Arrays.asList(13, 1200, 125, 4, 43, 47, 12001)));
    }

    public static ArrayList<Integer> subInt(int sub, List<Integer> listIni) {
        ArrayList<Integer> listIndex = new ArrayList<>();
        int divider = 10;
        String subStr = Integer.toString(sub);
        String dividerStr = Integer.toString(divider);

        if (subStr.length() > 1) {
            for (int i = 0; i < subStr.length() - 1; i++) {
                dividerStr += "0";
            }
        }
        int dividerInt = Integer.parseInt(dividerStr);
        int subInt = Integer.parseInt(subStr);

        for (int i = 0; i < listIni.size(); i++) {
            if (listIni.get(i) % dividerInt == sub) {
                listIndex.add(i + 1);
            }
        }
        return listIndex;
    }
}
