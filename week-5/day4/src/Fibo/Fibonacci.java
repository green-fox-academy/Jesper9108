package Fibo;

public class Fibonacci {

    public Fibonacci() {

    }

    public int getFibonacciNumber(int index) {
        int first = 0;
        int second = 1;
        int numberFib = 0;
        for (int i = 0; i < index - 1; i++) {
            if (index == 0) {
                numberFib = first;
            } else if (index == 1) {
                numberFib = second;
            } else {
                numberFib = first + second;
                first = second;
                second = numberFib;
            }
        }
        return numberFib;
    }


}
