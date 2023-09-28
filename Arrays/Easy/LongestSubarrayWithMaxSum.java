package Arrays.Easy;

public class LongestSubarrayWithMaxSum {
    //Brute force - TC - O(N3)
    static int getLongestSubarray(int[] a, long k) { //input is always positive
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            for (int j = i; j < n; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    // Optimal approach - O(N)
    static int findLongestSubarrayLength(int arr[], int k) {
        int n = arr.length;
        int left = 0; // Initialize the left pointer
        int right = 0; // Initialize the right pointer
        int currentSum = 0; // Initialize the current sum
        int maxLength = 0; // Initialize the maximum length of the subarray

        while (right < n) {
            currentSum += arr[right]; // Add the element at the right pointer to the current sum

            if (currentSum == k) {
                int currLength = right - left + 1; // Calculate the current subarray length
                maxLength = Math.max(maxLength, currLength); // Update maxLength if the current length is greater
            }

            while (currentSum > k) {
                currentSum -= arr[left]; // Remove the element at the left pointer from the current sum
                left++; // Move the left pointer to the right to adjust the window size
            }

            right++; // Move the right pointer to the right to expand the window
        }

        return maxLength; // Return the maximum length of the subarray
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        int k = 5;
        int result = findLongestSubarrayLength(arr, k);
        System.out.println(result); // Output: 2 (Longest subarray with sum 5: [2, 3])
    }
}
