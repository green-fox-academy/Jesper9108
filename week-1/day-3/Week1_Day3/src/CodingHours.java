public class CodingHours {
    public static void main(String[] args) {

        int dailyCodingHours = 6;
        int semesterLength = 17;
        int semesterCodingHours = semesterLength * 5 * dailyCodingHours;
        int semesterHours = semesterLength * 52;
        double codingPercentage = semesterCodingHours / semesterHours;
        System.out.println("An attendee spends " + semesterCodingHours + " hours with coding in a semester");
        System.out.println(codingPercentage);
    }
}
