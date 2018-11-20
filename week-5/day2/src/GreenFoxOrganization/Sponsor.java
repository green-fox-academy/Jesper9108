package GreenFoxOrganization;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
        super();
        this.company = company;
        this.hiredStudents = hiredStudents;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public String introcude() {
        return super.introduce() + " who represents " + company + " and hired " + hiredStudents + " students so far";
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }


}
