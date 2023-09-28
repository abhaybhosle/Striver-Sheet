public class BinarySearch {
    public static int binary(int nums[], int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 5, 6, 7, 8, 9 };
        int target = 8;
        int ind = binary(nums, target);
        if (ind == -1) {
            System.out.println("The target is not present");
        } else {
            System.out.println("The target is at index " + ind);
        }
    }
}
