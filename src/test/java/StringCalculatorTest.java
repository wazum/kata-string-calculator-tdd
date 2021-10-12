import static org.junit.jupiter.api.Assertions.assertEquals;

import com.wazum.stringcalculator.StringCalculator;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    @Test
    void addEmptyStringReturnsZero() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    void addStringWithZeroReturnsZero() {
        assertEquals(0, StringCalculator.add("0"));
    }

    @Test
    void addStringWithOneReturnsOne() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    void addStringWithOneAndTwoReturnsThree() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    void addStringWithSevenAndNineReturnsSixteen() {
        assertEquals(16, StringCalculator.add("7,9"));
    }

    @Test
    void addStringWithZeroOneThreeFiveReturnsNine() {
        assertEquals(9, StringCalculator.add("0,1,3,5"));
    }

    @Test
    void stringWithDummyTextReturnsZero() {
        assertEquals(0, StringCalculator.add("lorem,ipsum"));
    }

    @Test
    void stringWithDummyTextAndSevenReturnsSeven ()
    {
        assertEquals(7, StringCalculator.add("lorem,ipsum,7"));
    }
}
