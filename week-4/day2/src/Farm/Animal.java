package Farm;

public class Animal {

    private int hunger = 50;

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    private int thirst = 50;

    public Animal() {

    }

    public int eat() {
        this.hunger--;
        return hunger;
    }

    public int drink() {
        this.thirst--;
        return thirst;
    }

    public void play() {
        this.hunger++;
        this.thirst++;
    }
}
