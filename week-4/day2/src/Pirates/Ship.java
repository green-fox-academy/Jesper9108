package Pirates;

import java.util.ArrayList;

public class Ship {

    ArrayList<Pirate> crew = new ArrayList<>();
    String name;


    public Ship() {

    }

    public Ship(String name) {
        this.name = name;
        System.out.println(name + " be now on water!");
        System.out.println();
    }

    void fillShip() {
        crew.add(new Pirate(true));

        int numCrew = (int) (Math.random() * 15) + 1;

        for (int i = 0; i < numCrew; i++) {
            crew.add(new Pirate(false));
        }

        //System.out.println(name + " has been filled wit' one Captain 'n crew o' " + (numCrew));
        //System.out.println();
    }


    boolean shipBattle(Ship ship) {

        int randomRum = (int) ((Math.random() * 5) + 1);
        int maxRum = 5;

        if (battleScore() > ship.battleScore()) {
            //System.out.println("Th' winner o' th' battle be " + name);
            //int crewLoss = (int) (Math.random() * ship.crew.size() + 1);
            if ((crew.get(0).intoxiCounter + randomRum) < maxRum) {
                crew.get(0).intoxiCounter += randomRum;
            } else {
                crew.get(0).intoxiCounter = maxRum;
            }
            return true;

        } else {
            //System.out.println("Th' winner o' th' battle be " + ship.name);
            if ((ship.crew.get(0).intoxiCounter + randomRum) < maxRum) {
                ship.crew.get(0).intoxiCounter += randomRum;
            } else {
                ship.crew.get(0).intoxiCounter = maxRum;
            }
            return false;
        }

    }

    void captainDrinkRum() {
        crew.get(0).drinkSomeRum();
        System.out.println("The captain of " + name + " just gobbled down some rum");
        System.out.println();
    }

    int battleScore() {
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

    void dataShip() {

        if (crew.size() > 0) {
            System.out.println(name + " has one Captain and " + (crew.size() - 1) + " pirates on board");
            System.out.println("The intoxication of " + name + "'s Captain is " + crew.get(0).intoxiCounter);
            System.out.println("The battlescore of " + name + " is " + battleScore());
        } else {
            System.out.println(name + " has no crew!");
        }
        System.out.println();
    }


}
