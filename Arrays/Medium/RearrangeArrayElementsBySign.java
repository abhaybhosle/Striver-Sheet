package Arrays.Medium;

public class RearrangeArrayElementsBySign {
    //TC O(N)
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int posIndx = 0;
        int negIndx = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[negIndx] = nums[i];
                negIndx += 2;
            } else {
                ans[posIndx] = nums[i];
                posIndx += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = { -1, 2, -3, 4, -5, 6 };

        // Call the rearrangeArray method
        int[] rearrangedArray = rearrangeArray(nums);

        // Print the rearranged array
        System.out.print("Rearranged Array: ");
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }
    }

}

/*
 * QUESTION: 2149. Rearrange Array Elements by Sign
 * 
 * You are given a 0-indexed integer array nums of even length consisting of an
 * equal number of positive and negative integers.
 * You should rearrange the elements of nums such that the modified array
 * follows the given conditions:
 * Every consecutive pair of integers have opposite signs.
 * For all integers with the same sign, the order in which they were present in
 * nums is preserved.
 * The rearranged array begins with a positive integer.
 * Return the modified array after rearranging the elements to satisfy the
 * aforementioned conditions.
 * 
 * Example 1:
 * 
 * Input: nums = [3,1,-2,-5,2,-4]
 * Output: [3,-2,1,-5,2,-4]
 */

/*
 * Optimal Method
 * 
 * Approach:
 * 
 * In this optimal approach, we will try to solve the problem in a single pass
 * and try to arrange the array elements in the correct order in that pass only.
 * We know that the resultant array must start from a positive element
 * 
 * 1) so we initialize the positive index as 0 and negative index as 1 and start
 * traversing the array such that whenever we see the first positive element, it
 * occupies the space at 0 and then posIndex increases by 2 (alternate places).
 * 
 * 2) Similarly, when we encounter the first negative element, it occupies the
 * position at index 1, and then each time we find a negative number, we put it
 * on the negIndex and it increments by 2.
 * 
 * 3) When both the negIndex and posIndex exceed the size of the array, we see
 * that the whole array is now rearranged alternatively according to the sign.
 */