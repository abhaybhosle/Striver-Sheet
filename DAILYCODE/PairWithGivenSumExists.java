/*
Check if pair with given Sum exists in Array (Two Sum)
Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 

Examples: 

Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation: If we calculate the sum of the output,1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}, x = 0
Output: No
*/

import java.util.*;

public class PairWithGivenSumExists {

    public static boolean pair(int arr[], int target) {

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int compliment = target - num;

            if (set.contains(num)) {
                return true;
            }
            set.add(compliment);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 1, 0, 5 };
        int target = 0;
        System.out.println(pair(arr, target));
    }
}
