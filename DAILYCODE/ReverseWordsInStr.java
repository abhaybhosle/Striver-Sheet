/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
*/

public class ReverseWordsInStr {

    public static String reverse(String s) {
        String[] words = s.trim().split("\\s+");

        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s = " hello world  ";
        String ans = reverse(s);
        System.out.println(ans);
    }
}
