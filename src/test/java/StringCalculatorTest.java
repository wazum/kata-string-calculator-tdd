import static org.junit.jupiter.api.Assertions.assertEquals;

import com.wazum.stringcalculator.StringCalculator;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    @Test
    void addEmptyStringReturnsZero() {
        assertEquals(0, StringCalculator.add(""));
    }
}
