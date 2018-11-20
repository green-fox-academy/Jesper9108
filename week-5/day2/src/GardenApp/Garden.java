package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plantlist;

    public Garden(String color1, String color2, String color3, String color4) {
        this.plantlist = new ArrayList<>();
        plantlist.add(new Flower(color1));
        plantlist.add(new Flower(color2));
        plantlist.add(new Tree(color3));
        plantlist.add(new Tree(color4));
    }

    public void status() {
        for (int i = 0; i < plantlist.size(); i++) {
            System.out.print(plantlist.get(i).waterAmount + " - ");
        }
    }

    public void plantstatus() {
        for (int i = 0; i < plantlist.size(); i++){
            if (plantlist.get(i).needsWater()){
                System.out.println("The " + plantlist.get(i).color + " " + plantlist.get(i).type + " needs water");
            } else
                System.out.println("The " + plantlist.get(i).color + " " + plantlist.get(i).type + " does not need water");
        }
    }

    public int plantsToWater() {
        int counter = 0;
        for (int i = 0; i < plantlist.size(); i++) {
            if (plantlist.get(i).needsWater()) {
                counter++;
            }
        }
        return counter;
    }

    public void waterwith40() {
        double plantwater = 40 / plantsToWater();
        for (int i = 0; i < plantlist.size(); i++) {
            if (plantlist.get(i).type == "Flower" && plantlist.get(i).needsWater()) {
                plantlist.get(i).waterAmount += plantwater * 0.75;
            } else if (plantlist.get(i).type == "Tree" && plantlist.get(i).needsWater()) {
                plantlist.get(i).waterAmount += plantwater * 0.4;
            }
        }
        System.out.println("Watering with 40");
    }

    public void waterwith70() {
        double plantwater = 70 / plantsToWater();
        for (int i = 0; i < plantlist.size(); i++) {
            if (plantlist.get(i).type == "Flower" && plantlist.get(i).needsWater()) {
                plantlist.get(i).waterAmount += plantwater * 0.75;
            } else if (plantlist.get(i).type == "Tree" && plantlist.get(i).needsWater()) {
                plantlist.get(i).waterAmount += plantwater * 0.4;
            }
        }
        System.out.println("Watering with 70");
    }


}
