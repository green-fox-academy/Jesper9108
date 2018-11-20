package GardenApp;

public class Plant {

    double waterAmount;
    String color;
    String type;

    public Plant() {
        waterAmount = (Math.random() * 5) + 1;

    }

    public boolean needsWater() {
        if (type == "Flower" && waterAmount < 5) {
            return true;
        } else if (type == "Tree" && waterAmount < 10) {
            return true;
        } else {
            return false;
        }
    }

    public void wateringPercent(double water) {
        if (type == "Flower") {
            waterAmount += water * 0.75;
        } else if (type == "Tree") {
            waterAmount += water * 0.4;
        }

    }
}
