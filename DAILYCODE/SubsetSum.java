public class SubsetSum {

    public static void subsetSums(int[] arr, int index, int currentSum) {
        int n = arr.length;

        // Base case: if index reaches the end of the array
        if (index == n) {
            System.out.print(currentSum + " ");
            return;
        }

        // Include the current element and move to the next index
        subsetSums(arr, index + 1, currentSum + arr[index]);

        // Exclude the current element and move to the next index
        subsetSums(arr, index + 1, currentSum);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3 };

        System.out.print("Subset sums for arr: ");
        subsetSums(arr, 0, 0);
        System.out.println();
    }
}
