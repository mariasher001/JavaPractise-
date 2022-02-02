import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class factorialTest {
    @Test
public void factorialRecursionTest(){
    factorial fc = new factorial();
    Assertions.assertEquals(120,fc.factorialRecursion(5));
    Assertions.assertEquals(120,fc.factorialRecursion(5));
    Assertions.assertNotEquals(120,fc.factorialRecursion(6));
}

}