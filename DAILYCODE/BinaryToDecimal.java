import java.util.Scanner;

public class BinaryToDecimal {

    public static int binaryTodecimal(int n) {
        int t = n;
        int i = 0;
        int decimal = 0;

        while (t > 0) {
            int r = t % 10; //last digit 
            t = t / 10; //removal of last digit
            decimal += r * (int) Math.pow(2, i++);
        }
        return decimal;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        int n = sc.nextInt();
        System.out.println(binaryTodecimal(n));
    }
}
