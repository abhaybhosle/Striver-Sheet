package Arrays.Medium;
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.
// Example 1:
// Input: nums = [1,1,1], k = 2
// Output: 2
import java.util.HashMap;
import java.util.Map;

public class CountSubarrayWithGivenSum {

    public static int subarraySum(int[] nums, int k) { //TC - O(N)
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        int count = 0;

        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += nums[i];
            int remove = preSum - k;
            count += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }

}


/*
Approach:

The steps are as follows:

1) First, we will declare a map to store the prefix sums and their counts.
2) Then, we will set the value of 0 as 1 on the map.
3) Then we will run a loop(say i) from index 0 to n-1(n = size of the array).
4) For each index i, we will do the following:
    a) We will add the current element i.e. arr[i] to the prefix sum.
    b) We will calculate the prefix sum i.e. x-k, for which we need the occurrence.
    c) We will add the occurrence of the prefix sum x-k i.e. mpp[x-k] to our answer.
    d) Then we will store the current prefix sum in the map increasing its occurrence by 1. */