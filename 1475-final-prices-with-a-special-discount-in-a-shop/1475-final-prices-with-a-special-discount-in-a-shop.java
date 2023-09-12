class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        
        int j = 0;
        
        for(int i = 0; i < prices.length; i++){
            for(j = i + 1; j < prices.length; j++){
                if(prices[j] <= prices[i]){
                    res[i] = prices[i] - prices[j];
                    break;
                }
            }
            
            if(j == prices.length)
                res[i] = prices[i];
        }
        
        return res;
    }
}