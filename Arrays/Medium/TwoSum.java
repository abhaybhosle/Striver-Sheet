package Arrays.Medium;

/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

 Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.*;

public class TwoSum {
    // Brute Force - O(N2)
    static int[] twoSums(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    // Optimal Approach - O(N)
    /*
     * Certainly, here's a concise approach for finding two numbers in an array that
     * add up to a target value with a time complexity of O(n):
     * 
     * 1. Create a HashMap to store elements from the array along with their
     * indices.
     * 2. Iterate through the array once.
     * 3. For each element, calculate the complement (target - element).
     * 4. Check if the complement is already in the HashMap:
     * - If it is, return the indices of the current element and its complement.
     * - If it's not, add the current element to the HashMap.
     * 5. If no solution is found after the iteration, return an empty array.
     * 
     * This approach ensures that you find a pair of elements efficiently with a
     * single pass through the array, making it O(n) in terms of time complexity.
     */
    static int[] twoSum(int arr[], int target) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int compliment = target - arr[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(arr[i], i);

        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        // int n = arr.length;
        int result[] = twoSum(arr, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to the target:");
            System.out.println("Index 1: " + result[0]);
            System.out.println("Index 2: " + result[1]);
        } else {
            System.out.println("No solution found.");
        }

    }
}
