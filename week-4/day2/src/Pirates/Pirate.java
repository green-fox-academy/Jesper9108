package Pirates;

public class Pirate {
    boolean captain = false;
    boolean alive = true;
    int intoxiCounter = 0;


    public Pirate(boolean captain) {
        this.captain = captain;
    }

    void drinkSomeRum() {
        intoxiCounter++;
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
    }

    void brawl(Pirate pirate) {
        int chance = (int) (Math.random()*3 +1);
        if (pirate.alive && chance == 1){
            alive = false;
        } else if (pirate.alive && chance == 2){
            pirate.alive = false;
        } else if (pirate.alive && chance ==3){
            pirate.alive = false;
            alive = false;
        }
        System.out.println(chance);
    }

}
