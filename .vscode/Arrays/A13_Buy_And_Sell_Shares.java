package Arrays;

public class A13_Buy_And_Sell_Shares {

    public static int max_profit(int stocks[]){
        int bp = stocks[0];
        int profit = 0;
        int c = 0;

        for(int i=1;i<stocks.length;i++){
            // bp = Math.min(stocks[i],bp);
            // profit = Math.max(profit, (stocks[i]-bp));
            // return profit;

            
            if(stocks[i] < stocks[i-1] || stocks[i]<bp){
                c += profit;
                bp = stocks[i];
                profit = 0;
            }
            else if(stocks[i]-bp > profit){
                profit = stocks[i]-bp;
            }
        }
        return c + profit;
    }
    public static void main(String[] args) {
        // int stocks[] = {7,1,5,3,6,4};
        // int stocks[] = {4,2,5,1};
        // int stocks[] = {86, 92 ,24 ,5 ,34, 72 ,68, 52, 27, 95, 41, 28, 35};
        // int stocks[] = {100, 180, 260, 310, 40, 535, 695};
        int stocks[] = {4,2,2,4};
        int res = max_profit(stocks);
        System.out.println("Max Profit is :  "+res);
    }
}
