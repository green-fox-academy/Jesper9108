package GardenApp;

public class GardenMain {

    public static void main(String[] args) {

        Garden garden = new Garden("yellow", "blue", "purple", "orange");

        garden.plantstatus();
        System.out.println();

        garden.waterwith40();
        garden.plantstatus();
        System.out.println();

        garden.waterwith70();
        garden.plantstatus();
    }
}
