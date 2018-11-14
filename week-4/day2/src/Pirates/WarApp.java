package Pirates;

import java.util.Arrays;

public class WarApp {
    public static void main(String[] args) {
        Armada Spanish = new Armada("Spanish");

        Armada Pirates = new Armada("Pirates");

        Spanish.armadaBattleScore();
        System.out.println();
        Pirates.armadaBattleScore();
        System.out.println();

        System.out.println(Spanish.armadaWar(Pirates));
        System.out.println();

        Spanish.armadaBattleScore();
        System.out.println();
        Pirates.armadaBattleScore();





    }
}
