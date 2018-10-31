import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilometers to change:");
        double numKM = scanner.nextDouble();

        System.out.println(numKM + "KM(s) in Mile(s): " + numKM * 0.62137);

    }
}
