package Accenture;

public class P2 {
    public static int OperationsBinaryString(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        char[] arr = str.toCharArray();
        int result = Character.getNumericValue(arr[0]);

        for(int i=1; i < arr.length; i = i+2){
            
        }

    }

    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        int result = OperationsBinaryString(str);
        System.out.println(result);
    }
}
