import java.util.*;

public class TopKElements {
    //TC - O(n) , SC - O(n)
    public static int[] topKElements(int nums[], int k) {
        // Bucket to store numbers based on their frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        // Map to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        // Populate the bucket with numbers based on their frequency
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        // Result array to store the top k elements
        int res[] = new int[k];
        int counter = 0;

        // Iterate through the bucket in reverse order to get top k elements
        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                // Add elements from the bucket to the result array
                for (Integer integer : bucket[i]) {
                    res[counter++] = integer;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Input array
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        // Number of top elements to find
        int k = 2;
        // Find top k elements
        int[] result = topKElements(nums, k);

        // Print the result
        System.out.println("Top " + k + " elements are: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
