
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    private StringCalculator testObj;

    @BeforeEach
    public void setUp() {
        testObj = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        testObj = null;
    }

    @Test //String with multiple spaces
    public void testNegativeNumber() {
        assertEquals(3, testObj.add("-2,5"));
    }

    @Test //String with Digits and Special Characters
    public void testPositiveNumber() {
        assertEquals(12, testObj.add("8,4"));
    }


}
