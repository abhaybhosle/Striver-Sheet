package Recursion;
//Sum of first N Natural Numbers
public class Program3 {
    public static void fuct(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first " + n + " is = " + sum);

    }

    public static void main(String[] args) {
        int n = 5;
        fuct(n);

    }
}
