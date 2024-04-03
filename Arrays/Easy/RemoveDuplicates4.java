package Arrays.Easy;

import java.util.*;

/*
Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

Example 1: 

Input: arr[1,1,2,2,2,3,3]

Output: arr[1,2,3,_,_,_,_]

Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.
 */
public class RemoveDuplicates4 {

    // Brute Force Approach -
    // Time complexity: O(n*log(n))+O(n)
    // Space Complexity: O(n) 
    static int removeDuplicates(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>(); // does not store duplicate values
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
        return k; // returns the size of the set containing unique elements

    }

    // Optimal Approach - Two Approach
    // Time Complexity: O(N)
    // Space Complexity: O(1)

    /*
     * Approach :
     * Take a variable i as 0;
     * Use a for loop by using a variable ‘j’ from 1 to length of the array.
     * If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
     * After completion of the loop return i+1, i.e size of the array of unique
     * elements.
     */
    static int removeDup(int arr[], int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        int n = arr.length;
        int k = removeDup(arr, n);
        System.out.print("The Array after removing duplicate element is : ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
