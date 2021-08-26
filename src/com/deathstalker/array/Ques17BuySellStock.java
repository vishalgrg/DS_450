package com.deathstalker.array;

public class Ques17BuySellStock {

    public static void main(String[] args) {
        System.out.print(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static  int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;
        for(int i = 0;i < prices.length;i++) {
            if(min_price > prices[i])
                min_price = Math.min(min_price, prices[i]);
            else if(prices[i] - min_price > max_profit)
                max_profit = Math.max(max_profit, prices[i] - min_price);
        }
        return max_profit;
    }
}
