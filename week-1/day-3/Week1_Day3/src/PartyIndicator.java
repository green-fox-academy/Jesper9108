import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many girls will be there at the party?");
        int numGirls = scanner.nextInt();

        System.out.println("How many boys will be there at the party?");
        int numBoys = scanner.nextInt();

        if (numGirls == 0){
            System.out.println("Sausage Party");
        } else if ( (numGirls + numBoys) <= 20 ){
            System.out.println("Average party...");
        } else if ( (numGirls + numBoys) > 20 && numGirls != numBoys){
            System.out.println("Quite cool party!");
        } else if ( (numGirls + numBoys) > 20 && numGirls == numBoys){
            System.out.println("The party is excellent!");
        };
    }

}
