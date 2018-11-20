package GardenApp;

public class Tree extends Plant {

    public Tree(String color) {
        this.color = color;
        this.type = "Tree";
    }

    public boolean needsWater(){
        return waterAmount < 10;
    }
}
