package Day3;
/*
 * You are required to input the size of the matrix then the elements of matrix, 
 * then you have to divide the main matrix in two sub matrices(even and odd) in such a way that elements at 0 index will be considered as even and element at 1st index will be considered as odd and so on.
 *  then you have to sort the even and odd matrices in ascending order 
 * then print the sum of second largest number from both the matrices
 */
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrix: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns for the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        // Inputting elements into the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Dividing the main matrix into even and odd matrices
        int[][] evenMatrix = new int[rows][columns];
        int[][] oddMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i + j) % 2 == 0) {
                    evenMatrix[i][j] = matrix[i][j];
                } else {
                    oddMatrix[i][j] = matrix[i][j];
                }
            }
        }

        // Sorting even and odd matrices
        for (int[] row : evenMatrix) {
            Arrays.sort(row);
        }
        for (int[] row : oddMatrix) {
            Arrays.sort(row);
        }

        // Finding the second largest number from both matrices
        int secondLargestEven = evenMatrix[0][Math.max(0, evenMatrix[0].length - 2)];
        int secondLargestOdd = oddMatrix[0][Math.max(0, oddMatrix[0].length - 2)];

        System.out.println("Second largest number in the even matrix: " + secondLargestEven);
        System.out.println("Second largest number in the odd matrix: " + secondLargestOdd);

        // Printing the sum of the second largest numbers
        int sum = secondLargestEven + secondLargestOdd;
        System.out.println("Sum of second largest numbers from both matrices: " + sum);

        scanner.close();
    }
}
