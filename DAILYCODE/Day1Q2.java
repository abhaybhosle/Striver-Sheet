import java.util.*;
/*
-> Task:
Takes a string as input and calculates the sum of all the numbers present in the string.

Example:
Given the string "abc123def45gh6", the program should calculate the sum of numbers in the string, which would be 123 + 45 + 6 = 174.

 */
public class Day1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with numbers : ");
        String input = sc.nextLine();

        // code here
        int sum = 0;
        int currNum = 0;
        boolean isNumber = false;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                currNum = currNum * 10 + (c - '0');
                isNumber = true;
            } else {
                if (isNumber) {
                    sum = sum + currNum;
                    currNum = 0;
                    isNumber = false;
                }
            }
        }
        if (isNumber) {
            sum += currNum;
        }
        System.out.println(sum);
    }
}
