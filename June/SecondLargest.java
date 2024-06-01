package June;

public class SecondLargest {
    public static int secondLargest(int arr[]) {
        int n = arr.length;

        if (n < 2) {
            return -1;
        }

        int largest = arr[0];
        int slargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static int secondSmallest(int arr[]) {
        int n = arr.length;

        if (n < 2) {
            return -1;
        }

        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 1, 9 };
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));
    }
}
