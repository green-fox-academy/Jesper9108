package Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> listofAnimals = new ArrayList<>();
    int totalSpaces;
    int freeSpaces = totalSpaces - listofAnimals.size();

    void breed() {
        if (freeSpaces > 0) {
            listofAnimals.add(new Animal());
        }
    }

    void slaughtered() {
        int minValue = listofAnimals.get(0).getHunger();
        for (int i = 0; i < listofAnimals.size(); i++) {
            if (listofAnimals.get(i).getHunger() < minValue) {
                minValue = listofAnimals.get(i).getHunger();
            }
        }

        for (int i = 0; i < listofAnimals.size(); i++) {
            if (listofAnimals.get(i).getHunger() == minValue) {
                listofAnimals.remove(i);
            }
        }
    }

}
