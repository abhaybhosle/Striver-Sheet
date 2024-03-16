import java.util.*;
//Non-Repeatating characters
public class Day1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();

        // code here
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (char c : input.toCharArray()) {
            if (freqMap.get(c) == 1) {
                System.out.print(c + " ");
            }
            freqMap.put(c, -1);
        }

        sc.close();
    }
}
