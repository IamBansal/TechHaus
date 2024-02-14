import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/*
    PROBLEM 8:
        Write a program that accepts a string such a “4h 20m 10s” and prints the total number of seconds it represents.
        The string above will result in 4 x 3600 + 20 x 60 + 10 = 15610 seconds.
 */
public class Problem8 {

    public static int convertToSeconds(String str){

        if(str.isEmpty()) return 0;
        int seconds = 0;

        for (String timeFrame : str.split("\\s+")) {
            int time = Integer.parseInt(timeFrame.substring(0, timeFrame.length() - 1));
            if (timeFrame.endsWith("h")) seconds += time * 3600;
            else if (timeFrame.endsWith("m")) seconds += time * 60;
            else if (timeFrame.endsWith("s")) seconds += time;
        }

        return seconds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //This is done to make inout string in acceptable format only..
        System.out.println("Enter the time string in required format only...");
        System.out.println(convertToSeconds(sc.nextLine()) + " seconds");

        sc.close();
    }

    @Test
    public void testConvertToSecondsFunction() {
        assertEquals(15610, convertToSeconds("4h 20m 10s"));
        assertEquals(0, convertToSeconds(""));
        assertEquals(3600, convertToSeconds("1h"));
        assertEquals(120, convertToSeconds("2m"));
        assertEquals(5, convertToSeconds("5s"));
        assertEquals(3665, convertToSeconds("1h 1m 5s"));
    }
}
