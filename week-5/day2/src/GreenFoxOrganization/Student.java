package GreenFoxOrganization;

public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) { //removed skippeddays parameter to make it compatible with the test input
        super();
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        previousOrganization = "The School of life";
    }

    void getGoal() {
        System.out.println("Be a junior software developer");
    }

    public String introduce() {
        return super.introduce() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already";
    }

    void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

}
