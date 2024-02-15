package problem5;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem5Test {

    @Test
    public void testIsSpecialArrayFunction() {
        assertTrue(Problem5.isSpecialArray(new int[][] {{4, 5, 6}, {5, 3, 2}, {4, 2, 5}}));
        assertTrue(Problem5.isSpecialArray(new int[][] {{-4, -5, -6}, {-5, -3, -2}, {-4, -2, -5}}));
        assertFalse(Problem5.isSpecialArray(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertTrue(Problem5.isSpecialArray(new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
    }
}
