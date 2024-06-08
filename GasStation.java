public class GasStation {
    public static int canCompleteCircuit(int gas[], int cost[]) {
        int currentFuel = 0;
        int totalFuel = 0;
        int totalCost = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalFuel += gas[i];
            totalCost += cost[i];
        }

        if (totalFuel < totalCost) {
            return -1;
        }

        for (int i = 0; i < gas.length; i++) {
            currentFuel += (gas[i] - cost[i]);
            if (currentFuel < 0) {
                start = i + 1;
                currentFuel = 0;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
