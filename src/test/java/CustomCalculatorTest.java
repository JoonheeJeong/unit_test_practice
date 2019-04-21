import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    @Test
    public void addTest() {
        CustomCalculator cc = new CustomCalculator();
        int result = cc.add(3, 4);
        assertTrue(result == 7);
    }

    @Test
    public void subTest() {
        CustomCalculator cc = new CustomCalculator();
        int result = cc.sub(3, 4);
        assertTrue(result == -1);
    }

    @Test
    public void mulTest() {
        CustomCalculator cc = new CustomCalculator();
        int result = cc.mul(3, 4);
        assertTrue(result == 12);
    }

    @Test
    public void divTest() {
        CustomCalculator cc = new CustomCalculator();
        int result = cc.div(3, 4);
        assertTrue(result == 0);
    }

}