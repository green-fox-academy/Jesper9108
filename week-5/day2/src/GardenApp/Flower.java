package GardenApp;

public class Flower extends Plant {

    public Flower(String color) {
        this.color = color;
        this.type = "Flower";
    }

    public boolean needsWater() {
        return waterAmount < 5;
    }

}

