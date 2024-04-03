/*
Find missing elements of a range
Given an array, arr[0..n-1] of distinct elements and a range [low, high], find all numbers that are in a range, but not the array. The missing elements should be printed in sorted order.

Examples:  

Input: arr[] = {10, 12, 11, 15}, 
       low = 10, high = 15
Output: 13, 14
Input: arr[] = {1, 14, 11, 51, 15}, 
       low = 50, high = 55
Output: 50, 52, 53, 54 55
*/
import java.util.*;

public class MissingNums {

    public static void printMissNum(int arr[], int low, int high) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(i);
        }

        for (int i = low; i <= high; i++) {
            if (!hs.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6 };
        int low = 1;
        int high = 10;
        printMissNum(arr, low, high);
    }
}
