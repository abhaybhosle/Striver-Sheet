package Arrays.Medium;

public class RotateImage {


    //                           Approach:

    //          Step 1: Transpose the matrix. (transposing means
    //           changing columns to rows and rows to columns)
        
    //             Step 2: Reverse each row of the matrix.

        static void rotate(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        //Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) { //we need not to change the diaganol , or the reverse should be till middle
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(arr);
        int n = arr.length;
        System.out.println("Rotated Image");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}


// Complexity Analysis
// Time Complexity: O(N*N) + O(N*N).One O(N*N) is for transposing the matrix and the other is for reversing the matrix.

// Space Complexity: O(1).