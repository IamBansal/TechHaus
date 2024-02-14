import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

/*
    PROBLEM 2:
        Write a program that accepts an array of numbers, sorts them in descending order and prints the sorted array.
 */
public class Problem2 {

    //Sort function - sorts in descending order
    public static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int e : array) System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int[] array = new int[sc.nextInt()];

        System.out.println("Continue entering the elements of the array....");
        for (int i = 0; i < array.length; i++) array[i] = sc.nextInt();
        sort(array);

        sc.close();
    }

    //Test function for descending sort function
    @Test
    public void testSortFunction() {
        int[] input = {2, 3, 4, 7, 1, 0, -1, 1};
        int[] expected = {7, 4, 3, 2, 1, 1, 0, -1};
        sort(input);
        assertArrayEquals(expected, input);
    }
}