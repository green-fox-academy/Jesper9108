package Sum;

import java.util.ArrayList;

public class Sum {



    public Sum() {

    }

    public int sumOfElements(ArrayList<Integer> listIntegers) {
        int totalSum = 0;

        for (int i = 0; i < listIntegers.size(); i++) {
            totalSum += listIntegers.get(i);
        }
        return totalSum;
    }


}
