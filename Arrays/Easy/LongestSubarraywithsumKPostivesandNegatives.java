package Arrays.Easy;

import java.util.*;

public class LongestSubarraywithsumKPostivesandNegatives {
    // Optimal Approach TC - O(N)
    public static int getLongestSubarray(int[] nums, int k) {
        int n = nums.length;

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            // calculate the prefix sum till the index i:
            sum += nums[i];
            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            // calculate the sum of remaining part i.e x-k:
            int rem = sum - k;// remaining part

            // Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 1, 1 };
        int k = 1; // sum
        int len = getLongestSubarray(nums, k);
        System.out.println("The length of the Longest subarray is : " + len);
    }
}
