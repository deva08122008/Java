
class Solution{
    public int maxProfit(int []prices){
        if(prices.length==0){
            return 0;
        }
        int minprice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            int currentprice=prices[i];
            if(currentprice<minprice){
                minprice=currentprice;
            }
            else{
                int currentprofit=currentprice-minprice;
                if(currentprofit > maxProfit){
                    maxProfit = currentprofit;
                }
            }
        }
        return maxProfit;
    }
}




