package problem8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem8Test {


    @Test
    public void testConvertToSecondsFunction() {
        assertEquals(15610, Problem8.convertToSeconds("4h 20m 10s"));
        assertEquals(0, Problem8.convertToSeconds(""));
        assertEquals(3600, Problem8.convertToSeconds("1h"));
        assertEquals(120, Problem8.convertToSeconds("2m"));
        assertEquals(5, Problem8.convertToSeconds("5s"));
        assertEquals(3665, Problem8.convertToSeconds("1h 1m 5s"));
    }
}
