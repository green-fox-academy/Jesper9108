public class ConditionalVariableMutation {
    public static void main(String[] args) {

        double a = 24;
        int out = 0;

        if (a % 2 == 0){
            out++;
        };
        System.out.println(out +"\n");

        int b = 21;
        String out2 = "";
        if (b > 10 && b < 20){
            out2 = "Sweet!";
        } else if (b < 10){
            out2 = "Less!";
        } else if (b > 20){
            out2 = "More!";
        };
        System.out.println(out2 +"\n");

        int c = 123;
        int credits = 100;
        boolean isBonus = true;
        if ( credits >= 50 && isBonus == false ){
            c -= 2;
        } else if (credits < 50 && isBonus == false){
            c -= 1;
        } else if (isBonus == true){
            c = c;
        };
        System.out.println(c + "\n");

        int d = 7;
        int time = 250;
        String out3 = "";

        if (d % 4 == 0 && time <= 200 ){
            out3 = "check";
        }else if (time > 200){
            out3 = "time out";
        }else {
            out3 = "Run Forest Run!";
        };
        System.out.println(out3);



    }
}
