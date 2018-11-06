import java.util.ArrayList;

public class JosephusProblem {
    public static void main(String[] args) {

        Josephus(7);

    }

    public static void Josephus(int numPeople) {
        ArrayList<Integer> listPeople = new ArrayList<>();
        for (int i = 1; i < numPeople + 1; i++) {
            listPeople.add(i);
        }

        int index = 1;
        while (listPeople.size() > 1) {
            if (index < listPeople.size()) {
                listPeople.remove(index);
                index++;
            } else {
                index = index - listPeople.size();
                listPeople.remove(index);
                index++;
            }
        }

        System.out.println(listPeople);
    }
}
