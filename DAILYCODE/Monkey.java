import java.util.Scanner;

public class Monkey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of monkeys : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of monkeys that eats bananas : ");
        int k = sc.nextInt();
        System.out.println("Enter the  number of monkeys that eats peanuts : ");
        int j = sc.nextInt();
        System.out.println("Enter the total number of bananas : ");
        int m = sc.nextInt();
        System.out.println("Enter the total number of peanuts : ");
        int p = sc.nextInt();

        if (n <= 0 || k <= 0 || j <= 0 || m <= 0 || p <= 0) {
            System.out.println("Invalid Inuputs");
        } else {
            int monkeysLeft = n - ((m / k) + (p / j));
            // Check if there are any remaining bananas or peanuts
            if (m % k != 0 || p % j != 0) {
                monkeysLeft--;
            }
            System.out.println("Number of monkeys left on Tree : " + monkeysLeft);
        }

        sc.close();
    }
}
