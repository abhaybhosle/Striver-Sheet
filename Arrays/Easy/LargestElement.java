package Arrays.Easy;

import java.util.Arrays;

public class LargestElement {
    //Brute Force Approach
    static int LE(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n - 1];
    }

    //Optimal Appraoch
    static int largesEle(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 0, 100 };
        System.out.println(largesEle(arr));
        System.out.println(LE(arr));

    }
}
