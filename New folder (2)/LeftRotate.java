public class LeftRotate {
    public static void left(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        left(arr, n);
    }
}