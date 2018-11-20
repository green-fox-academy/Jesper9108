package GreenFoxOrganization;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public String introduce() {
        return "Hi, I'm " + name + ", a " + age + " year old " + gender;
    }

    void getGoal() {
        System.out.println("My goal is: Live for the moment");
    }

}
