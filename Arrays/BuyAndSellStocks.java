package Arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6};
        System.out.println(buyAndSellStocks(prices));
    }

    private static int buyAndSellStocks(int[] prices) {
        int l = prices.length;
        int maxProfit = 0;
        for (int i = 0; i < l - 1; i++) {       // {7,1,5,3,6};
            for (int j = i + 1; j < l; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
