public class Calculator {
    public static void main(String[] args) {

        Calculator( "%",10, 3);

    }

    public static void Calculator(String operand, double num1, double num2) {
        double result = 0;
        if (operand == "-") {
            result = num1 - num2;
        } else if (operand == "+") {
            result = num1 + num2;
        } else if (operand == "*") {
            result = num1 * num2;
        } else if (operand == "/") {
            result = num1 / num2;
        } else if (operand == "%") {
            result = num1 % num2;
        }

        System.out.println(result);
    }
}
