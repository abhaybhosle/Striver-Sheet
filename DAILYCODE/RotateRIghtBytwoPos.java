public class RotateRIghtBytwoPos {

    public static void rightRotate(int arr[]) {
        int n = arr.length;
        reverseArr(arr, 0, n - 1);
        reverseArr(arr, 0, 1);
        reverseArr(arr, 2, n - 1);
    }

    public static void reverseArr(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rightRotate(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
