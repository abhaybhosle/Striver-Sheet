package DXC;

import java.util.*;

public class Attendance {
    public static int nonRepeatedCount(String ids) {
        Set<Character> uniqueSet = new HashSet<>();
        Set<Character> duplicateSet = new HashSet<>();

        for (char ch : ids.toCharArray()) {
            if (!uniqueSet.contains(ch)) {
                uniqueSet.add(ch);
            } else {
                uniqueSet.remove(ch);
                duplicateSet.add(ch);
            }
        }
        return uniqueSet.size();
    }

    public static void main(String[] args) {
        String ids = "abcdffdc";
        System.out.println(nonRepeatedCount(ids));

    }
}
