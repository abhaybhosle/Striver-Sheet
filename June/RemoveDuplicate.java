package June;

import java.util.HashSet;

public class RemoveDuplicate {

    public static int removeD(int arr[]) {//Brute force TC- N log(n) + N
        int n = arr.length;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }

    public static int removeDuplicates(int arr[]) { // optimial solution - TC - O(N)
        int n = arr.length;

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        System.out.println(removeDuplicates(arr));
        System.out.println(removeD(arr));
    }
}
