import java.sql.SQLOutput;

public class SubStr_op {
    public static void main(String[] args) {


        System.out.println(SubStr("This is what I am searching", "what"));
    }

     public static int SubStr (String textIn, String textSearch ){
        int index = 0;
        boolean isIn = false;


        for (int i = 0; i < textIn.length(); i++) {

            if (textSearch.charAt(0) == textIn.charAt(i)) {

                index = i;
                for (int j = 0; j < textSearch.length(); j++) {

                    if (textSearch.charAt(j) != textIn.charAt(i)) {
                        isIn = false;

                    } else {
                        isIn = true;

                    }
                    i++;
                }
            }
        }

        if (isIn = true){
            return index;
        }else{
            return -1;
        }
    }
}
