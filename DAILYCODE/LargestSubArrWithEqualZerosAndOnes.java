
/*
Largest subarray with equal number of 0s and 1s
Given an array containing only 0s and 1s, find the largest subarray which contains equal no of 0s and 1s. The expected time complexity is O(n). 

Examples: 

Input: arr[] = {1, 0, 1, 1, 1, 0, 0}
Output: 1 to 6 
(Starting and Ending indexes of output subarray)

*/
import java.util.*;

public class LargestSubArrWithEqualZerosAndOnes {

    public static void largestSubarray(int arr[]) {
        int sum = 0;
        int maxLen = 0;
        int start = -1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0 ? -1 : 1);

            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                if (len > maxLen) {
                    maxLen = len;
                    start = map.get(sum) + 1;
                }
            } else {
                map.put(sum, i);
            }
        }

        if (maxLen == 0) {
            System.out.println("No such subarray");
        } else {
            System.out.println("Largest subarray with equal 0s and 1s: " + start + " to " + (start + maxLen - 1));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1, 0, 0 };
        largestSubarray(arr);
    }
}
