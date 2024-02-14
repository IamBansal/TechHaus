import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
    PROBLEM 4:
        Write a program that accepts a string, counts the number of uppercase and
        lowercase letters in the string and prints whether the string contains
        equal number of uppercase and lowercase letters.
 */
public class Problem4 {

    public static boolean checkEqualCasing(String str){
        int upperCount = 0, lowerCount = 0;

        for(char c: str.toCharArray()) {
            if (Character.isUpperCase(c)) upperCount++;
            else if (Character.isLowerCase(c)) lowerCount++;
        }

        if (upperCount == lowerCount) System.out.println("The string contains an equal number of uppercase and lowercase letters.");
        else System.out.println("The string does not contain an equal number of uppercase and lowercase letters.");

        return upperCount == lowerCount;
    }

    public static boolean checkEqualCasingUsingASCII(String str){
        int upperCount = 0, lowerCount = 0;

        for(char c: str.toCharArray()) {
            if (c >= 65 && c <= 90) upperCount++;
            else if (c >= 97 && c <= 122) lowerCount++;
        }

        if (upperCount == lowerCount) System.out.println("The string contains an equal number of uppercase and lowercase letters.");
        else System.out.println("The string does not contain an equal number of uppercase and lowercase letters.");
        return upperCount == lowerCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it contains equal number of upper and lower case letters");
        checkEqualCasing(sc.nextLine());
        checkEqualCasingUsingASCII(sc.nextLine());

        sc.close();
    }

    @Test
    public void testUppercaseLowercaseCounter() {
        assertFalse(checkEqualCasing("Akshat Bansal"));
        assertFalse(checkEqualCasing("Akshat bansal"));
        assertTrue(checkEqualCasing("AkShAt   123   BaNsAl"));
        assertFalse(checkEqualCasing("AKSHAT BANSAL"));
        assertFalse(checkEqualCasing("akshat bansal"));

        assertFalse(checkEqualCasingUsingASCII("Akshat Bansal"));
        assertFalse(checkEqualCasingUsingASCII("Akshat bansal"));
        assertTrue(checkEqualCasingUsingASCII("AkShAt   123   BaNsAl"));
        assertFalse(checkEqualCasingUsingASCII("AKSHAT BANSAL"));
        assertFalse(checkEqualCasingUsingASCII("akshat bansal"));
    }
}
