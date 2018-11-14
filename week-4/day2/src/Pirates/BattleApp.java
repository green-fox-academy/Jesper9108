package Pirates;

public class BattleApp {

    public static void main(String[] args) {

        Ship BlackPearl = new Ship("Black Pearl");
        Ship Flying = new Ship("Flying");

        BlackPearl.fillShip();
        Flying.fillShip();

        BlackPearl.dataShip();
        Flying.dataShip();

        BlackPearl.shipBattle(Flying);

        BlackPearl.dataShip();
        Flying.dataShip();






    }
}
