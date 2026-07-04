public class BuyStock {

    public static int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buyprice) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 4, 7, 8, 5, 2, 6, 9 };
        System.out.println(maxProfit(prices));
    }
}
