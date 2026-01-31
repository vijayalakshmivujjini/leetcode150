class Solution {
    public int maxProfit(int[] prices) {

        int profit=0;
        int minbuy=prices[0];

        for(int right=1;right<prices.length;right++){
            // if(prices[right]<minbuy){  // modifing the prev best stock code
            //     minbuy=prices[right]; //This sets minbuy to the current selling price, before you take profit. so commented
            // }
            if(prices[right]>minbuy){
                profit+=prices[right]-minbuy; //continous profit

            }
            minbuy=prices[right];//for next iteration track the previous day’s price as minbuy, and take profit whenever there is a rise:

        }
        return profit;
    }
}