

import java.util.*;
public class G03_Fractional_Knapsack {

    
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 50;

        double arr[][] = new double[val.length][3];
        for(int i=0; i<val.length; i++){
            arr[i][0] = val[i];
            arr[i][1] = weight[i];
            arr[i][2] = (double)val[i]/weight[i];
        }

        Arrays.sort(arr,Comparator.comparingDouble(o->o[2]));   

        int profit = 0;

        for(int i = arr.length-1; i>=0; i--){
            if(arr[i][1]<=w){
                w -= arr[i][1];
                profit += arr[i][0];
            }
            else{
                profit += (arr[i][2]*w);
                w = 0;
                break;
            }
        }
        
        System.out.println("Profit is : "+profit);


    }
}
