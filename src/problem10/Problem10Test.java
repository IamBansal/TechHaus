package problem10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem10Test {

    @Test
    public void testSumOfMinMaxElementsFunction() {
        assertEquals(6, Problem10.sumOfMinMaxElements(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, Problem10.sumOfMinMaxElements(new int[]{10, 2, 3, 4, -9}));
        assertEquals(0, Problem10.sumOfMinMaxElements(new int[]{0, 0, 0, 0, 0}));
    }
}
