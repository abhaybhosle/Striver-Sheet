public class WiproQues {
    public static int calculateKey(int input1, int input2, int input3) {
        int hundredDigitOfInput1 = (input1 / 100) % 10;
        int tensDigitOfInput2 = (input2 / 10) % 10;
        int largestDigitOfInput3 = findLargest(input3);
        int key = (hundredDigitOfInput1 * tensDigitOfInput2) - largestDigitOfInput3;
        return key;
    }

    private static int findLargest(int number) {
        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }
        return largestDigit;
    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int key = calculateKey(input1, input2, input3);
        System.out.println(key);

    }
}
/*
You are provided with 3 numbers : input1, input2 and input3.
Each of these are four digit numbers within the range >=1000 and <=9999.
i.e.
1000 <= input1 <= 9999
1000 <= input2 <= 9999
1000 <= input3 <= 9999
You are expected to find the Key using the below formula -
Key = (Hundreds digit of input1 x Tens digit of input2) - (Largest digit of input3)
For e..g. if input1 = 3521, input2=2452, input3=1352, then Key = (5 x 5) - 5 = 20
Assuming that the 3 numbers are passed to the given function, Complete the function to find
and return the Key.Full java code​
*/