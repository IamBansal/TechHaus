package problem8;

import java.util.Scanner;

/*
    PROBLEM 8:
        Write a program that accepts a string such a “4h 20m 10s” and prints the total number of seconds it represents.
        The string above will result in 4 x 3600 + 20 x 60 + 10 = 15610 seconds.
 */
public class Problem8 {

    public static int convertToSeconds(String str){

        if(str.isEmpty()) return 0;
        int seconds = 0;

        //Splitting the string in sub-parts
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
}
