package Arrays.Easy;
// The approach used is to find the missing number in an array by subtracting the actual sum of its elements from the expected sum of the first n natural numbers using a mathematical formula.
public class MissingNumber {
    //TC - O(N)
    static int missingNumber(int nums[], int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        int n = nums.length;
        System.out.println(missingNumber(nums, n));
    }
}
