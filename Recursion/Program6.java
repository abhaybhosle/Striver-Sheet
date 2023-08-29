package Recursion;

public class Program6 {
    static boolean Palindrome(int i, String a) {
        if (i >= a.length() / 2) {
            return true;
        }
        if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
            return false;
        }
        return Palindrome(i + 1, a);
    }

    public static void main(String[] args) {
        String a = "abhay";
        System.out.println(Palindrome(0, a));
    }

}
