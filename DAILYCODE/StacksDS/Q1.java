package StacksDS;

import java.util.*;

public class Q1 {
    public static void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : s) {
            stack.push(c);
        }

        // Pop characters from the stack and overwrite the original array
        for (int i = 0; i < s.length; i++) {
            s[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        char[] s1 = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s1);
        System.out.println(s1); // Output: "olleh"

        char[] s2 = { 'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString(s2);
        System.out.println(s2); // Output: "hannaH"
    }
}
