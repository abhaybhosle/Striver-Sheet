import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day1Q3 {

    public static void main(String[] args) {
        System.out.println("Enter the size followed by the input numbers : ");
        Scanner scanner = new Scanner(System.in);
        


        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Code here
        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();
        
        for(int num : arr){
            if(!seen.add(num)){
                repeated.add(num);
            }
        }
        
        for(int num: repeated){
            System.out.print("Repeated elements are : "+num+ " ");
            
        }
        
    }
}
