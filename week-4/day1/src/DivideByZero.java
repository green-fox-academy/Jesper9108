public class DivideByZero {
    public static void main(String[] args) {

        Divide(0);
    }

    public static void Divide (int num){
        try {
            int result = 10 / num;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Fail");
        }
    }
}
