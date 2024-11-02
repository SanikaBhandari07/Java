package Arrays;

public class A13_Buy_And_Sell_Shares {

    public static int max_profit(int stocks[]){
        int bp = stocks[0];
        int profit = 0;
        for(int i=1;i<stocks.length;i++){
            bp = Math.min(stocks[i],bp);
            profit = Math.max(profit, (stocks[i]-bp));
        }
        return profit;
    }
    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};
        int res = max_profit(stocks);
        System.out.println("Max Profit is :  "+res);
    }
}
