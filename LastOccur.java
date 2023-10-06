public class LastOccur {
    static int solve(int arr[], int n, int target) {
        int left = 0;
        int right = n - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                res = mid;
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 3, 3, 3, 8 };
        int n = 9;
        int target = 3;
        System.out.println(solve(arr, n, target));

    }
}
//Time Complexity: O(log n)

//Space Complexity: O(1)

