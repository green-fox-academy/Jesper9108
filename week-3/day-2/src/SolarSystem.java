import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        putSaturn(planetList);
    }

    public static void putSaturn(List<String> userInput){
        userInput.add(5, "Saturn");
        System.out.println(userInput);

    }
}
