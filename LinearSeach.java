public class LinearSeach {
    public static int linearSearch(int nums[], int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        int target = 4;
        int ind = linearSearch(nums, target);
        if (ind == -1) {
            System.out.println("The target is not there");
        } else {
            System.out.println("The targer is at index " + ind);
        }
    }
}
