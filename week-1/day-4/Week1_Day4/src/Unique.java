import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 3, 14, 65, 34, 14, 71, 65, 10, 8};
        int count = 0;

        for (int i = 0; i < list.length-1; i++){
            for (int j = i + 1; j <list.length-1; j++){
                if ( list [i] == list[j]){
                    count++;
                }
            }
        }

        int [] newList = new int [list.length - count];
        System.out.println(Arrays.toString(newList));

        for (int i = 0; i < newList.length-1; i++){
            for (int j = 0; j < list.length-1; j++){

            }
        }

    }
}


