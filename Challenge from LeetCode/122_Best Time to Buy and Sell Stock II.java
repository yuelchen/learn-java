class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        
        for(int i=1; i<prices.length; i++) {
            
            //check to see if make any profit between previous date, if so aggregate
            //if prices increases again next index, we can simply add the difference between previous
            //as if we never sold the date before
            
            if(prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        
        return maxProfit;
    }
}
