package DXC;

public class BulbConnection {
    public static int bulbCon(int state[], int distance[], int n) {
        int minCableLen = 0;
        int lastBulbIndex = -1;

        for (int i = 0; i < state.length; i++) {
            if (state[i] == 1) {
                lastBulbIndex = i;
            } else if (state[i] == 0) {
                minCableLen += distance[i] - distance[lastBulbIndex];
                lastBulbIndex = i;
            }
        }
        return minCableLen;
    }

    public static void main(String[] args) {
        int state[] = { 1, 0, 0 };
        int distance[] = { 1, 5, 6 };
        int n = 3;
        System.out.println(bulbCon(state, distance, n));
    }
}
