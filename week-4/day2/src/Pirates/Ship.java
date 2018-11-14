package Pirates;

import java.util.ArrayList;

public class Ship {

    ArrayList<Pirate> crew = new ArrayList<>();
    String name;


    public Ship(String name) {
        this.name = name;
        System.out.println(name + " be now on water!");
        System.out.println();
    }

    void fillShip() {
        crew.add(new Pirate(false));

        int numCrew = (int) (Math.random() * 15) + 1;

        for (int i = 0; i < numCrew; i++) {
            crew.add(new Pirate(false));
        }

        System.out.println(name + " has been filled wit' one Captain 'n crew o' " + (numCrew));
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

    private int battlescore(Ship ship) {
        int score;
        int counterAlive = 0;

        for (int i = 1; i < crew.size(); i++) {
            if (crew.get(i).alive) {
                counterAlive++;
            }
        }
        score = counterAlive - crew.get(0).intoxiCounter;

        return score;

    }

    void dataShip(Ship ship) {

        if (ship.crew.size() > 0) {
            System.out.println(name + " has one Captain and " + (ship.crew.size()-1) + " pirates on board");
            System.out.println("The intoxication of " + name + "'s Captain is " + crew.get(0).intoxiCounter);
            System.out.println("The battlescore of " + name + "is " + battlescore(ship));
        } else {
            System.out.println(name + " has no crew!");
        }
        System.out.println();
    }


}
