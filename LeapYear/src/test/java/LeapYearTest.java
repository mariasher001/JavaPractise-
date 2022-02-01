import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearTest {
    @Test
    public void test1() {
        LeapYear lp = new LeapYear();
        Assertions.assertThrows(Exception.class, () -> lp.LeapYear(2001));
    }
}