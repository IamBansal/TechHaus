package problem7;

import java.util.Scanner;

/*
    PROBLEM 7:
        In Java, an integer is a signed 32-bit number.
        Therefore, there is a maximum (and a minimum) value that can be stored in a variable of integer type.
        An attempt to assign a numeric value that exceeds this maximum value is known as an overflow condition.
        For example, assume that a Java integer has 8 bits.
        Therefore, the maximum value that can be stored in an 8-bit variable is 127 and the minimum value that can be stored is -128.
        Attempting to store the value 1000 in an 8-bit integer would result in an overflow.
        Write a program that accepts 2 integers and determines if adding and multiplying those 2 integers will result in an overflow.
 */
public class Problem7 {

    //Type casting the result to long, and if the values are beyond integer range, then it will overflow.
    public static boolean willOverflowOnAddition(int num1, int num2) {
        long sum = (long) num1 + num2;
        return sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE;
    }

    public static boolean willOverflowOnMultiplication(int num1, int num2) {
        if (num1 == 0 || num2 == 0) return false;
        long product = (long) num1 * num2;
        return product > Integer.MAX_VALUE || product < Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to perform addition....");
        System.out.println("Will adding result in overflow: " + willOverflowOnAddition(sc.nextInt(), sc.nextInt()));

        System.out.println("Enter numbers to perform multiplication....");
        System.out.println("Will multiplication result in overflow: " + willOverflowOnMultiplication(sc.nextInt(), sc.nextInt()));

        sc.close();
    }
}
