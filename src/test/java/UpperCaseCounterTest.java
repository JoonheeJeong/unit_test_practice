import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {
    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void getNumberOfUpperCaseCharactersInString_param_null() {
        String str = null;

        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }

    @Test
    public void getNumberOfUpperCaseCharactersInString_param_blank() {
        String str = "";

        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }

    @Test
    public void getNumberOfUpperCaseCharactersInString_param_ABC() {
        String str = "ABC";

        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result: " + result);
    }

    @Test
    public void getNumberOfUpperCaseCharactersInString_param_ABCdfg123HijK() {
        String str = "ABCdfg123HijK";

        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result: " + result);
    }
}