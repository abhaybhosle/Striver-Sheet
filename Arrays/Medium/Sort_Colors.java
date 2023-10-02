package Arrays.Medium;

/*
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */
public class Sort_Colors {
    // TC - O(N)
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        int n = nums.length;
        sortColors(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}
/*
 * 1) First, we will run a loop that will continue until mid <= high.
 * 2) There can be three different values of mid pointer i.e. arr[mid]
 * a) If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment
 * both low and mid. Now the subarray from index 0 to (low-1) only contains 0.
 * b) If arr[mid] == 1, we will just increment the mid pointer and then the
 * index (mid-1) will point to 1 as it should according to the rules.
 * c)If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement
 * high. Now the subarray from index high+1 to (n-1) only contains 2.
 * In this step, we will do nothing to the mid-pointer as even after swapping,
 * the subarray from mid to high(after decrementing high) might be unsorted. So,
 * we will check the value of mid again in the next iteration.
 * 3)
 * Finally, our array should be sorted.
 */