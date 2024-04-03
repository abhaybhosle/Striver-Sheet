/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
  
*/

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConseq(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr) {
            hs.add(num);
        }
        int longestSeq = 0;

        for (int num : hs) {
            if (!hs.contains(num - 1)) {
                int currNum = num;
                int currSeq = 1;

                while (hs.contains(currNum + 1)) {
                    currNum++;
                    currSeq++;
                }
                longestSeq = Math.max(longestSeq, currSeq);
            }
        }
        return longestSeq;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        int ans = longestConseq(arr);
        System.out.println(ans);

    }
}
