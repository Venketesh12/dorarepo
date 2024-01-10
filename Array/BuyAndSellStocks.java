public class BuyAndSellStocks {
    public static int heavyProfit(int prices[]){
        int maxProfit = 0;
        int buyprice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            int currPrice = prices[i];
            if(currPrice > buyprice){
                int profit = currPrice - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyprice = currPrice;
            }

            if(maxProfit < 0){
                return 0;
            }
        }
        return maxProfit;
        
    }
    public static void main(String args[]){
        int prices[] = {7, 6, 5, 4, 2, 1};
        
        System.out.println(heavyProfit(prices));

    }
}
