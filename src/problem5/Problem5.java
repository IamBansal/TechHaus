package problem5;

import java.util.Scanner;

/*
    PROBLEM 5:
        Write a program to accept values into a 3×3 array of integers and check if it is a special array.
        An array is special if the sum of its even elements = sum of the odd elements.
        For example, consider the following array:
            A[][]={{ 4 ,5, 6}, { 5 ,3, 2}, { 4, 2, 5}};
            Sum of even elements = 4+6+2+4+2 =18
            Sum of odd elements= 5+5+3+5=18
        Therefore, this array is special.
 */
public class Problem5 {

    public static boolean isSpecialArray(int[][] array) {
        int evenSum = 0, oddSum = 0;

        for (int[] arr : array) {
            for (int num : arr) {
                if (num % 2 == 0) evenSum += num;
                else oddSum += num;
            }
        }

        return evenSum == oddSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];

        System.out.println("Enter the elements of the matrix...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) array[i][j] = sc.nextInt();
        }

        System.out.println(isSpecialArray(array));
        sc.close();
    }
}
