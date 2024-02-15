package problem9;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Problem9Test {

    @Test
    public void testSortStringsFunction() {
        String[] input = {"a", "bc", "abc", "b", "cd", "acd"};
        String[] expected = {"a", "b", "bc", "cd", "abc", "acd"};
        Problem9.sortStrings(input);
        assertArrayEquals(expected, input);
    }
}
