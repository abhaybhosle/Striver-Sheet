import java.util.Scanner;

public class DecimalToBinary {

    public static String decimalToBinary(int decimal) {
        String result = "";
        int t = decimal;
        while (t > 0) {
            int r = t % 2;
            t = t / 2;
            result = r + result;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        int decimal = sc.nextInt();
        System.out.println(decimalToBinary(decimal));
        sc.close();
    }
}
