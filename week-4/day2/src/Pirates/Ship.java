package Pirates;

import java.util.ArrayList;

public class Ship {

    ArrayList<Pirate> crew = new ArrayList<>();

    public Ship() {

    }


    void fillShip() {
        crew.add(new Pirate(true));

        int numCrew = (int) (Math.random() * 15) + 1;

        for (int i = 0; i < numCrew; i++) {
            crew.add(new Pirate(false));
        }

        //crew.get(0).intoxiCounter;

    }


    boolean shipBattle(Ship ship) {
        int counterShip = 0;
        int counter = 0;



        for (int i = 0; i < ship.crew.size(); i++) {
            if (ship.crew.get(i).alive) {
                counterShip++;
            }
        }
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).alive) {
                counter++;
            }
        }

        if (counter > counterShip) {
            return true;
        } else {
            return false;
        }

    }


}
