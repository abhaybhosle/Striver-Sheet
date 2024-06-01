package June;

public class RotateArray {
    public static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than the length of the array

        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        rotateArray(arr, k);
        
        System.out.println("\nArray after rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
