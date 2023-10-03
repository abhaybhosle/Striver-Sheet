package Arrays.Medium;

import java.util.*;

public class SetMatrixZero {
    // BruteForce
    /*
     * Approach:
     * The steps are the following:
     * 
     * First, we will use two loops(nested loops) to traverse all the cells of the
     * matrix.
     * If any cell (i,j) contains the value 0, we will mark all cells in row i and
     * column j with -1 except those which contain 0.
     * We will perform step 2 for every cell containing 0.
     * Finally, we will mark all the cells containing -1 with 0.
     * Thus the given matrix will be modified according to the question.
     */
    // static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int
    // i) { // TC O((N*M)*(N + M)) + O(N*M)
    // for (int j = 0; j < m; j++) {
    // if (matrix.get(i).get(j) != 0) {
    // matrix.get(i).set(j, -1);
    // }
    // }
    // }

    // static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int
    // j) {
    // for (int i = 0; i < n; i++) {
    // if (matrix.get(i).get(j) != 0) {
    // matrix.get(i).set(j, -1);
    // }
    // }
    // }

    // static ArrayList<ArrayList<Integer>> ZeroMatrix(ArrayList<ArrayList<Integer>>
    // matrix, int n, int m) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (matrix.get(i).get(j) == 0) {
    // markRow(matrix, n, m, i);
    // markCol(matrix, n, m, j);
    // }
    // }
    // }

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (matrix.get(i).get(j) == -1) {
    // matrix.get(i).set(j, 0);
    // }
    // }
    // }
    // return matrix;

    // }

    // Better Approach TC - O(2(n*m))
    /*
     * Approach (Using two extra arrays):
     * 
     * The steps are as follows:
     * 
     * First, we will declare two arrays: a row array of size N and a col array of
     * size M and both are initialized with 0.
     * Then, we will use two loops(nested loops) to traverse all the cells of the
     * matrix.
     * If any cell (i,j) contains the value 0, we will mark ith index of row array
     * i.e. row[i] and jth index of col array col[j] as 1. It signifies that all the
     * elements in the ith row and jth column will be 0 in the final matrix.
     * We will perform step 3 for every cell containing 0.
     * Finally, we will again traverse the entire matrix and we will put 0 into all
     * the cells (i, j) for which either row[i] or col[j] is marked as 1.
     * Thus we will get our final matrix.
     */
    static ArrayList<ArrayList<Integer>> ZeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row = new int[n]; // row array
        int[] column = new int[m]; // column array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || column[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = ZeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
