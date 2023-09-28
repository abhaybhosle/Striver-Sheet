package Arrays.Easy;

public class SecondSmallestSecondLargest {
    //Optimal Approach - 
    //Time Complexity: O(N), Single-pass solution 
    //Space Complexity: O(1)
    static int secondSmallest(int nums[], int n) {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] < small) {
                second_small = small;
                small = nums[i];
            } else if (nums[i] < second_small && nums[i] != small) {
                second_small = nums[i];
            }

        }
        return second_small;
    }

    static int secondLargest(int nums[], int n) {
        if (n < 2) {
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > large) {
                second_largest = large;
                large = nums[i];
            } else if (nums[i] > second_largest && nums[i] != large) {
                second_largest = nums[i];
            }
        }
        return second_largest;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 7, 7, 5 };
        int n = nums.length;
        System.out.println(secondSmallest(nums, n));
        System.out.println(secondLargest(nums, n));

    }
}
