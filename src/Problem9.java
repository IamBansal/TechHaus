import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

/*
    PROBLEM 9:
        Write a program that accepts an array of strings and sorts them first by string length and then in alphabetical order.
        For example, strings with shorter length should appear before those with longer length.
 */
public class Problem9 {
    public static void sortStrings(String[] strings) {
        String temp;
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                } else if (strings[j].length() == strings[j + 1].length()) {
                    if (strings[j].compareTo(strings[j + 1]) > 0) {
                        temp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings..");
        String[] stringArray = new String[sc.nextInt()];

        System.out.println("Continue entering string elements.....");
        for (int i = 0; i < stringArray.length; i++) stringArray[i] = sc.next();

        sortStrings(stringArray);
        System.out.println("Sorted strings array:");
        for (String str : stringArray) System.out.println(str);
    }

    @Test
    public void testSortStringsFunction() {
        String[] input = {"a", "bc", "abc", "b", "cd", "acd"};
        String[] expected = {"a", "b", "bc", "cd", "abc", "acd"};
        sortStrings(input);
        assertArrayEquals(expected, input);
    }
}
