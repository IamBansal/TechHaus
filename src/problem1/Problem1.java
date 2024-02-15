package problem1;

import java.util.Scanner;

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

}