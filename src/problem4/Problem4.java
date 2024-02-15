package problem4;

import java.util.Scanner;

/*
    PROBLEM 4:
        Write a program that accepts a string, counts the number of uppercase and
        lowercase letters in the string and prints whether the string contains
        equal number of uppercase and lowercase letters.
 */
public class Problem4 {

    //Checks for casing using inbuilt isUpperCase, isLowerCase function
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

    /*
    Checks for casing using ASCII values for UpperCase and LowerCase characters
        UpperCase letters: 65-90
        LowerCase letters: 97-122
     */
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
}
