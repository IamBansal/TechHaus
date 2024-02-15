package problem4;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem4Test {

    @Test
    public void testUppercaseLowercaseCounter() {
        assertFalse(Problem4.checkEqualCasing("Akshat Bansal"));
        assertFalse(Problem4.checkEqualCasing("Akshat bansal"));
        assertTrue(Problem4.checkEqualCasing("AkShAt   123   BaNsAl"));
        assertFalse(Problem4.checkEqualCasing("AKSHAT BANSAL"));
        assertFalse(Problem4.checkEqualCasing("akshat bansal"));
    }
    @Test
    public void testUppercaseLowercaseCounterUsingASCII() {
        assertFalse(Problem4.checkEqualCasingUsingASCII("Akshat Bansal"));
        assertFalse(Problem4.checkEqualCasingUsingASCII("Akshat bansal"));
        assertTrue(Problem4.checkEqualCasingUsingASCII("AkShAt   123   BaNsAl"));
        assertFalse(Problem4.checkEqualCasingUsingASCII("AKSHAT BANSAL"));
        assertFalse(Problem4.checkEqualCasingUsingASCII("akshat bansal"));
    }
}
