package Arrays.Easy;
/*
Count Maximum Consecutive One’s in the array : 
Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
 */
public class CountMaximumConsecutiveOnesinthearray {
    //TC - O(N)
    static int findMaxConsecutiveOnes(int nums[], int n) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, 1, 1, 0, 1, 1, 1 };
        int n = nums.length;
        System.out.println(findMaxConsecutiveOnes(nums, n));
    }
}
