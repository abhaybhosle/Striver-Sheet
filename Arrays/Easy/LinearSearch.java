package Arrays.Easy;

public class LinearSearch {
    // Time Complexity: O(n), where n is the length of the array.
    // Space Complexity: O(1)
    static int linearsearch(int arr[], int search) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7 };
        int search = 5;
        System.out.println(linearsearch(arr, search));
    }
}
