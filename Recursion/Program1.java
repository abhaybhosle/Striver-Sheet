package Recursion;
//Print 1 to N using Recursion
public class Program1 {
    static void fuct(int i, int n) {
        if (i > n) {
            return;

        }
        System.out.println(i);
        fuct(i + 1, n);
    }

    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        fuct(i, n);
    }
}
