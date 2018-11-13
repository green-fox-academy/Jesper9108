import java.util.ArrayList;

public class PostIt {

    String backgroundColor;
    String text;
    String textColor;


    public PostIt() {

    }


    public static void main(String[] args) {

        PostIt example1 = new PostIt();
        PostIt example2 = new PostIt();
        PostIt example3 = new PostIt();

        example1.backgroundColor = "orange";
        example1.textColor = "blue";
        example1.text = "Idea1";

        example2.backgroundColor = "pink";
        example2.textColor = "black";
        example2.text = "Awesome";

        example3.backgroundColor = "yellow";
        example3.textColor = "green";
        example3.text = "Superb!";

    }
}
