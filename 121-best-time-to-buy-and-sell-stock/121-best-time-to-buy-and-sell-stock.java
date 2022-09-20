class Solution {
    public int maxProfit(int[] prices) {
        int l=0, r=1;
        int mxp=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit=prices[r]-prices[l];
                mxp=Math.max(profit, mxp);
            }else{
                l=r;
            }
            r+=1;
        }
       return mxp; 
    }
}