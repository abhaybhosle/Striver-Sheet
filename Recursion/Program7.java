package Recursion;
//The Fibonacci series is a series of elements where, the previous two elements are added to get the next element, starting with 0 and 1. 
public class Program7 {
    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }

    }
}
