package StringsDS;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map1.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);

    }

    public static void main(String[] args) {
        String s = "silent";
        String t = "listenn";
        boolean isValid = isAnagram(s, t);
        System.out.println(isValid);
    }
}
