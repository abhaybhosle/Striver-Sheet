import java.util.HashSet;

public class MissingEleLeetcode {

    public static int missEle(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();

       for(int num : arr){
            hs.add(num);
       }

        for (int i = 0; i <= arr.length; i++) {
            if (!hs.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0,1,2,4};
        int ans = missEle(arr);
        System.out.println(ans);
    }
}
