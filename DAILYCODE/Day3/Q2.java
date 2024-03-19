/*
* Given an integer arr Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
*  Note : 1st element of the array should be considered in the count of the result.
for example 
Arr[] = {7,4,8,2,9}
As 7 is the first element, it will consider in the result.
8 and 9 are also the elements that are greater than all of its previous elements.
since total of 3 elements is present in the array that meets the condition.
Hence the output = 3
*/
package Day3;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements into the array : ");
        
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int max = Integer.MIN_VALUE;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)

            {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
