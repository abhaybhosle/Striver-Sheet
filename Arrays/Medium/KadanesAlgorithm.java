package Arrays.Medium;
/*
 * Approach:

1)We will run a loop(say i) to iterate the given array.
2) Now, while iterating we will add the elements to the sum variable and consider the maximum one.
3) If at any point the sum becomes negative we will set the sum to 0 as we are not going to consider it as a part of our answer.
 */
public class KadanesAlgorithm {
    //TC O(N)
    public static int maxSumArraySum(int arr[], int n) {
        int sum = 0;
        int j = 0;
        int maxSum = 0;
        while (j < n) {
            sum += arr[j];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
            j++;

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        int a = maxSumArraySum(arr, n);
        System.out.println(a);
    }
}
