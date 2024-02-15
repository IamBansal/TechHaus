package problem10;

import java.util.Scanner;

/*
    PROBLEM 10:
        Write a program that finds the sum of the smallest and largest numbers in an array of numbers.
 */
public class Problem10 {

    public static int sumOfMinMaxElements(int[] array){
        int min = array[0], max = array[0];
        for (int e: array){
            min = Math.min(min, e);
            max = Math.max(max, e);
        }
        return min + max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int[] array = new int[sc.nextInt()];

        System.out.println("Continue entering the elements of the array....");
        for (int i = 0; i < array.length; i++) array[i] = sc.nextInt();
        System.out.println(sumOfMinMaxElements(array));

        sc.close();
    }
}
