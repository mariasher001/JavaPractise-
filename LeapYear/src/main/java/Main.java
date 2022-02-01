public class Main {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        try {
            leapYear.LeapYear(2001);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
