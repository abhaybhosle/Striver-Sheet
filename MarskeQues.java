import java.util.*;

public class MarskeQues {
    public static int sumOfElementsWithSquareRoots(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int totalSum = 0;
        for (int num : arr) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num && set.contains(sqrt)) {
                totalSum += num;
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7, 8, 9, 3};
        System.out.println(sumOfElementsWithSquareRoots(arr));
    }
}
