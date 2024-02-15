package problem6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem6Test {

    @Test
    public void testCalculateTotalInterest() {
        assertEquals(Problem6.calculateTotalInterest(1000, 5, 12), 51.162, 0.001);
        assertEquals(Problem6.calculateTotalInterest(2000, 7.5, 24), 322.584, 0.001);
        assertEquals(Problem6.calculateTotalInterest(5000, 3.25, 6), 81.802, 0.001);
        assertEquals(Problem6.calculateTotalInterest(3000, 4, 36), 381.816, 0.001);
    }
}
