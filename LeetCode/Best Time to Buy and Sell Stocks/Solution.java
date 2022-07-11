class Solution {
    public int maxProfit(int[] prices) {
        int cdiff = 1000000 , odiff = 0, pdiff =0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i] < cdiff) cdiff = prices[i];
            
            pdiff = prices[i]-cdiff;
            
            if(odiff < pdiff)
                odiff = pdiff;
        }
        
        return odiff;
        }
    }