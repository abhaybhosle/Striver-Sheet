/*
Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

Examples:

Input: {-1, 2, -1, 3, 0}
Output: 2
*/

import java.util.*;

public class FirstNPE {
    public static int firstNonRepEle(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, -1, 3, 0 };
        System.out.println("First Non Repeating Element : " + firstNonRepEle(arr));

    }
}
