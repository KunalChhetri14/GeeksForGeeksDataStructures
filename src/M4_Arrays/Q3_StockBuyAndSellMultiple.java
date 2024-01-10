package M4_Arrays;

public class Q3_StockBuyAndSellMultiple {

    public static void main(String args[]) {

      int prices[] = {7,1,5,3,6,4};
              //{1, 5, 3, 8, 12};
      int profit = findProfits(prices);
      System.out.println("Profit is :: "+ profit);

    }

    public static int findProfits(int prices[]) {
        int profit = 0;
        int boughtPrice = prices[0];

        for(int i=1; i<prices.length; i++) {
            if(i==prices.length-1) {
                if(prices[i]>boughtPrice) {
                    profit += prices[i]-boughtPrice;
                }
            } else {
                if(prices[i]>boughtPrice) {
                    if(prices[i+1]<=prices[i]) {
                        profit += prices[i]-boughtPrice;
                        boughtPrice = prices[i+1];
                        i++;
                    }
                } else {
                    boughtPrice = prices[i];
                }
            }

        }
        return profit;
    }

    //Efficient solution
    public int maxProfit(int[] prices) {
        int profit = 0;
        int boughtPrice = prices[0];

        for(int i=1; i<prices.length; i++) {
            if(prices[i-1]<prices[i]) {
                profit+= prices[i]-prices[i-1];
            }
        }
        return profit;
    }

}
