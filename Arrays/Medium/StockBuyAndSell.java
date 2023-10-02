package Arrays.Medium;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class StockBuyAndSell {
    public static int maxProfit(int[] prices) {
        // TC O(N)
        int minprice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else {
                int potentialProfit = prices[i] - minprice;

                if (potentialProfit > Maxprofit) {
                    Maxprofit = potentialProfit;
                }
            }
        }
        return Maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
/*
 ** 
 * Approach:**
 * 
 * 1. Initialize `minprice` to a very high value (or the first element in the
 * array) and `Maxprofit` to 0.
 * 
 * 2. Iterate through the array of stock prices.
 * 
 * 3. For each price:
 * - If the current price is less than `minprice`, update `minprice` to the
 * current price.
 * - Otherwise, calculate `potentialProfit` by subtracting `minprice` from the
 * current price.
 * - If `potentialProfit` is greater than `Maxprofit`, update `Maxprofit` with
 * `potentialProfit`.
 * 
 * 4. After the loop, return `Maxprofit` as the maximum profit achievable.
 * 
 * This approach ensures that you track the minimum price and the maximum profit
 * as you traverse the array, ultimately finding the maximum profit achievable
 * by buying and selling the stock.
 */