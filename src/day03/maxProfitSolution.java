package day03;

public class maxProfitSolution {
    public static void main(String[] args) {
        int[] prices1 = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices1));

        int[] prices2 = new int[]{7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices.length > 0 ? prices[0] : 0;
        int profit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            profit = Math.max(profit, price - minPrice);
        }
        return profit;
    }
}
