package problem3;

import java.util.Scanner;

/*
    PROBLEM 3:
        Write a program that checks whether an integer is a prime number.
 */
public class Problem3 {

    public static boolean isPrime(int n) {
        if (n <= 3) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not");

        System.out.println(isPrime(sc.nextInt()));
        sc.close();
    }
}
