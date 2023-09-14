package Arrays;

public class RemoveDuplicateFromSortedArray {
    static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int temp[] = new int[n];
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[count++] = arr[i];

            }

        }
        temp[count++] = arr[n - 1];
        for (int i = 0; i < count; i++) {
            arr[i] = temp[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3 };
        int n = arr.length;
        n = removeDuplicates(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
