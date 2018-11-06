import java.util.ArrayList;

public class Candyshop {
    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        sweets(arrayList);

    }

    public static void sweets(ArrayList<Object> userInput) {
        userInput.set(1, "Croissant");
        userInput.set(3, "Ice cream");
        System.out.println(userInput);
    }
}
