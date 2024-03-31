import java.util.Scanner;

public class ParkingAlot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of col : ");
        int col = sc.nextInt();
        int parking[][] = new int[row][col];
        System.out.println("Enter the element into the matrix : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                parking[i][j] = sc.nextInt();
            }
        }

        int count = 0, max = 0, index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (parking[i][j] == 1) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    index = i + 1;
                }
            }
        }

        System.out.print("Row : "+index+"  "+ "has the maximum number of 1's");
        sc.close();

    }
}

/*
A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.

Example 1:
Input :
3   -> Value of R(row)
3    -> value of C(column)
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
Output :
3  -> Row 3 has maximum number of 1’s
 */