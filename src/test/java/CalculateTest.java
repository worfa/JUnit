import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    Calculate calculation = new Calculate();
    int sum = calculation.sum(2,5);
    int testSum = 7;

    @Test
    public void testSum(){
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        assertEquals (sum,testSum);
    }

}