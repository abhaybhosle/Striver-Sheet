/*
Find the length of largest subarray with 0 sum
Given an array arr[] of length N, find the length of the longest sub-array with a sum equal to 0.

Examples:

Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23}
Output: 5
Explanation: The longest sub-array with elements summing up-to 0 is {-2, 2, -8, 1, 7}

Input: arr[] = {1, 2, 3}
Output: 0
Explanation: There is no subarray with 0 sum
*/

import java.util.HashMap;

public class LargestSubArrLen {

    public static int largestSubArrLen(int arr[]) {
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen++;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int arr[] = {1,2,3};
        System.out.println("Length of longest subarray with 0 sum: " + largestSubArrLen(arr));
    }
}
