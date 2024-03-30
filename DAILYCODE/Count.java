import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string with alphates,digits and special characters : ");
        String inp = sc.nextLine();

        int alphates = 0;
        int digits = 0;
        int special = 0;

        for (char ch : inp.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphates++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Alphabets : " + alphates);
        System.out.println("Digits : " + digits);
        System.out.println("Special Characters : " + special);

        sc.close();
    }
}
