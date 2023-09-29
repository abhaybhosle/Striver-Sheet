import java.util.*;

public class Triplets {

    static List<List<Integer>> triplets(int arr[], int target) {
        int n = arr.length;
        Arrays.sort(arr);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    s.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        result.addAll(s);
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 3, 4, 1, 6, 9 };
        int target = 24;
        System.out.println(triplets(arr, target));

    }
}
