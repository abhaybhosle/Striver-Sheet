import java.util.Scanner;

public class Candies {
    public static void Candies1(int candies, int k, int n) {
        int noOfCandsold = candies;
        int noOfCandsAva = n - candies;
        if (candies > k) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println("No of candies sold : " + noOfCandsold);
            System.out.println("No of candies available: " + noOfCandsAva);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of candies u want : ");
        int candies = sc.nextInt();

        int n = 10;
        int k = 5;

        Candies1(candies, k, n);
        sc.close();
    }
}
