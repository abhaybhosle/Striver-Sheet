package Arrays.Easy;

/*Problem Statement: Given an array of N integers, left rotate the array by one place.
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
*/
public class LeftRotateArrayByOne {
    // Brute Force :
    // Time Complexity: O(n), as we iterate through the array only once.
    // Space Complexity: O(n) as we are using another array of size, same as the
    // given array
    static void leftRotateArrayByOne(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    // Optimal Approach :
    // Time Complexity: O(n), as we iterate through the array only once.
    // Space Complexity: O(1) as no extra space is used
    static void leftRotate(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        // leftRotateArrayByOne(arr, n);
        leftRotate(arr, n);
    }
}
