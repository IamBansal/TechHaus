package problem7;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem7Test {

    @Test
    public void testWillOverflowOnAdditionFunction() {
        assertFalse(Problem7.willOverflowOnAddition(1000, 1000));
        assertFalse(Problem7.willOverflowOnAddition(-1000, -1000));
        assertTrue(Problem7.willOverflowOnAddition(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertTrue(Problem7.willOverflowOnAddition(Integer.MIN_VALUE, Integer.MIN_VALUE));
        assertTrue(Problem7.willOverflowOnAddition(Integer.MAX_VALUE, 1));
        assertFalse(Problem7.willOverflowOnAddition(Integer.MAX_VALUE - 1, 1));
    }

    @Test
    public void testWillOverflowOnMultiplicationFunction() {
        assertFalse(Problem7.willOverflowOnMultiplication(1000, 1000));
        assertFalse(Problem7.willOverflowOnMultiplication(-1000, -1000));
        assertTrue(Problem7.willOverflowOnMultiplication(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertTrue(Problem7.willOverflowOnMultiplication(Integer.MIN_VALUE, Integer.MIN_VALUE));
        assertTrue(Problem7.willOverflowOnMultiplication(Integer.MAX_VALUE, 2));
        assertFalse(Problem7.willOverflowOnMultiplication(Integer.MAX_VALUE / 2, 2));
    }
}
