package problem2;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Problem2Test {

    @Test
    public void testSortFunction() {
        int[] input = {2, 3, 4, 7, 1, 0, -1, 1};
        int[] expected = {7, 4, 3, 2, 1, 1, 0, -1};
        Problem2.sort(input);
        assertArrayEquals(expected, input);
    }
}
