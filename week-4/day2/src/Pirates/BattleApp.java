package Pirates;

public class BattleApp {

    public static void main(String[] args) {

        Ship BlackPearl = new Ship();
        Ship FlyingDutchman = new Ship();

        BlackPearl.fillShip();
        FlyingDutchman.fillShip();

        System.out.println(BlackPearl.shipBattle(FlyingDutchman));

    }
}
