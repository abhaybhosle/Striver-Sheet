package Arrays.Easy;

public class ArrayIsSorted {
    // Brute Force Approach
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    static boolean arrayIsSorted(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Optimal Approach
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    static boolean arrayissorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println(arrayIsSorted(arr, n));
        System.out.println(arrayissorted(arr, n));
    }
}
