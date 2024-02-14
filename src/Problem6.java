import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/*
    PROBLEM 6:
        Write a program that accepts a principal amount, a yearly rate of interest,
        number of months and computes the total interest earned on the principal amount
        at the provided rate of interest, compounded monthly.
 */
public class Problem6 {

    public static double calculateTotalInterest(double principalAmount, double rate, int months) {

        // CI = P(1 + (r/1200))12t - P
        return (principalAmount * Math.pow((1 + (rate / 1200)), (months))) - principalAmount;
    }

    public static void main(String[] args) {

        System.out.println(Math.pow(2, 3));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount, yearly rate of interest in percents, and number of months....");

        double totalInterest = calculateTotalInterest(sc.nextDouble(), sc.nextDouble(), sc.nextInt());
        System.out.println("Total interest earned: " + totalInterest);

        sc.close();
    }

    @Test
    public void testCalculateTotalInterest() {
        assertEquals(calculateTotalInterest(1000, 5, 12), 51.162, 0.001);
        assertEquals(calculateTotalInterest(2000, 7.5, 24), 322.584, 0.001);
        assertEquals(calculateTotalInterest(5000, 3.25, 6), 81.802, 0.001);
        assertEquals(calculateTotalInterest(3000, 4, 36), 381.816, 0.001);
    }
}
