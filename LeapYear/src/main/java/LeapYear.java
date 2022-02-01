public class LeapYear {

    public void LeapYear(int year) throws Exception {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is a leap-Year!");
        } else {
            throw new Exception("This isn't a leap-Year!");
        }

    }
}
