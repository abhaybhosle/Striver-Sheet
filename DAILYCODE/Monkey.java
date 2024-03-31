/*
The problem statement describes a scenario where there are n monkeys sitting on branches of a tree. Travelers offer bananas and peanuts to the monkeys, causing them to jump down the tree to eat. Each monkey can eat a certain number of bananas (k) and peanuts (j). The total number of bananas offered is m, and the total number of peanuts offered is p. The task is to calculate how many monkeys remain on the tree after some of them have jumped down to eat.

The conditions specified in the problem are:
- Monkeys jump down one at a time.
- Once a monkey jumps down and finishes eating, it does not climb back up.
- If there are fewer than k bananas or fewer than j peanuts left when the last monkey comes down, that monkey will eat whatever is available.

Example:
Input:
n = 20 (total number of monkeys)
k = 2 (number of bananas a single monkey can eat)
j = 3 (number of peanuts a single monkey can eat)
m = 12 (total number of bananas offered)
p = 12 (total number of peanuts offered)

Output:
Number of Monkeys left on the tree: 10

Explanation:
- The first monkey will eat 2 bananas and 3 peanuts.
- The second monkey will eat 2 bananas and 3 peanuts.
- This continues until either all bananas or all peanuts are consumed.
- Since both bananas and peanuts are equal in number, half of the monkeys will eat both before the resources run out, leaving half of them on the tree.

Invalid Input:
If any of the input values are invalid (such as non-positive integers, zero values for k or j, etc.), the output should be "INVALID INPUT".
*/
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
