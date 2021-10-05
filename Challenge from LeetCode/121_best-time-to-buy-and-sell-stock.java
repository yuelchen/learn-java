class Solution {
    public int maxProfit(int[] prices) {
        int lowestStarting = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < lowestStarting) {
                lowestStarting = prices[i];
                
                for(int j=i; j<prices.length; j++) {
                    int profit = prices[j] - prices[i];
                    maxProfit = profit > maxProfit ? profit : maxProfit;
                }
            }
        }
        
        return maxProfit;
    }
}
