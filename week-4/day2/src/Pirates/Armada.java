package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {

    List<Ship> shiplist = new ArrayList<>();

    public Armada(String name) {
        int sizeArmada = (int) (Math.random() * 5) + 1;

        for (int i = 0; i < sizeArmada; i++) {
            shiplist.add(new Ship());
            shiplist.get(i).fillShip();
        }
    }

    /*boolean armadaWar(Armada armada) {
        while (shiplist.size() > 0 && armada.shiplist.size() > 0) {

            if (shiplist.get(0).battleScore() > armada.shiplist.get(0).battleScore()) {
                armada.shiplist.remove(0);
            } else {
                shiplist.remove(0);
            }
        }
        if (shiplist.size() > 0) {
            return true;
        } else {
            return false;
        }

    }*/

    boolean armadaWar(Armada armada) {

        while (shiplist.size() > 0 && armada.shiplist.size() > 0) {

            System.out.println(shiplist.get(0).battleScore() + " - " + armada.shiplist.get(0).battleScore());


            if (shiplist.get(0).shipBattle(armada.shiplist.get(0))) {
                armada.shiplist.remove(0);

            } else {
                shiplist.remove(0);
            }
        }

        if (shiplist.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    void armadaBattleScore() {

        for (int i = 0; i < shiplist.size(); i++) {
            System.out.println("Armada" + (i + 1) + " " + shiplist.get(i).battleScore());
        }
    }


}
