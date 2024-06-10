package DXC;

import java.util.*;

public class RearrangeArray {
    public static void rearrange(int arr[]) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        evenList.addAll(oddList);

        for (int num : evenList) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 8, 1, 6, 9, 4 };
        rearrange(arr);
    }
}
