package Recursion;

//Print N to 1 using Recursion
public class Program2 {

    static void fuct(int i, int n) {
        if (i < n) {
            return;
        }
        System.out.println(i);
        fuct(i - 1, n);
    }

    public static void main(String[] args) {
        int i = 5;
        int n = 1;
        fuct(i, n);

    }
}
