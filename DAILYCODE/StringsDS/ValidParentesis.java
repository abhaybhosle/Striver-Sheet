package StringsDS;

import java.util.Stack;

public class ValidParentesis {

    public static boolean validPare(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (st.peek() == '(' && ch == ')' || st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "(())";
        boolean isValid = validPare(s);
        System.out.println("Is the string valid? " + isValid);
    }
}
