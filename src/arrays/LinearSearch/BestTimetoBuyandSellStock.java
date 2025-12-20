package arrays.LinearSearch;

/*
Question(Day 7 20-12-2025)- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        System.out.println(minPrice);
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
                System.out.println("Under loop max: "+maxProfit);// buy day
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // sell day
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}
