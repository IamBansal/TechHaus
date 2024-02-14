import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/*
    PROBLEM 1:
        Write a program that accepts an integer n and prints n rows as follows.
        n
        n n
        n n n
        n n n n
        ... up to n rows
 */
public class Problem1 {

    public static void pattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) System.out.print(n + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print");
        pattern(sc.nextInt());
        sc.close();
    }

    @Test
    public void testPatternFunction(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        pattern(5);

        // '\r' is added before \n as the output stream treats the line break as in line only.
        String expectedOutput = "5 \r\n5 5 \r\n5 5 5 \r\n5 5 5 5 \r\n5 5 5 5 5 \r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}