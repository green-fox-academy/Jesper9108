package Pirates;

public class Pirate {
    boolean captain = false;
    boolean alive = true;
    int intoxiCounter = 0;
    String name;

    public Pirate(boolean captain) {
        this.captain = captain;
    }

    public Pirate(String name, boolean captain) {
        this.captain = captain;
        if (captain) {
            System.out.println(name + " be a brave Captain!");
        } else {
            System.out.println(name + " be a yellow-bellied cur sea rat");
        }

    }

    void drinkSomeRum() {
        intoxiCounter++;
        System.out.println(name + " jus' drank some rum");
    }

    void howsitGoingMate() {
        if (0 <= intoxiCounter && intoxiCounter < 5) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    void die() {
        alive = false;
        System.out.println(name + " ,that son o' a gun jus' died");
    }

    void brawl(Pirate pirate) {
        int chance = (int) (Math.random() * 3 + 1);

        if (pirate.alive && chance == 1) {
            alive = false;
            System.out.println(pirate.name + " could win o'er " + name + ". " + name + " passed out.");
        } else if (pirate.alive && chance == 2) {
            pirate.alive = false;
            System.out.println(name + " could win o'er " + pirate.name + ". " + pirate.name + " passed out.");
        } else if (pirate.alive && chance == 3) {
            pirate.alive = false;
            alive = false;
            System.out.println("Both son o' a gun passed out");
        }
        System.out.println(chance);
    }

}
