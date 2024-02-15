package problem1;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Problem1Test {

    @Test
    public void testPatternFunction(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Problem1.pattern(5);

        // '\r' is added before \n as the output stream treats the line break as in line only.
        String expectedOutput = "5 \r\n5 5 \r\n5 5 5 \r\n5 5 5 5 \r\n5 5 5 5 5 \r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
