package GreenFoxOrganization;

public class Mentor extends Person {

    String level;

    public Mentor(String name, int age, String gender, String level) {
        super();
        this.level = level;
    }

    public Mentor() {
        super();
        level = "intermediate";
    }

    void getGoal() {
        System.out.println("Educate brilliant junior software developers");
    }

    public String introduce() {
        return super.introduce() + " " + level + " mentor";
    }
}
