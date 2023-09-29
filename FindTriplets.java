import java.util.Arrays;

public class FindTriplets {
    //Optimal solution O(N2)
    public static void findTriplets(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr); // Sort the array in ascending order

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == target) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    left++;
                    right--;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {12, 3, 4, 1, 6, 9};
        int target = 24;
        // System.out.println("Input: " + Arrays.toString(array1) + ", sum = " + sum1);
        findTriplets(array1, target);

        // int[] array2 = {1, 2, 3, 4, 5};
        // int sum2 = 9;
        // // System.out.println("\nInput: " + Arrays.toString(array2) + ", sum = " + sum2);
        // findTriplets(array2, sum2);
    }
}
