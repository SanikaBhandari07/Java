//Determining the minimum number of coins needed to make up a given amount using available denominations.

import java.util.*;

public class G04_Indian_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer denominations[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(denominations, Collections.reverseOrder());

        System.out.print("Enter the amount : ");
        int n = sc.nextInt();
        ArrayList <Integer> res = new ArrayList<>();

        for(int i=0; i<denominations.length; i++){
            if(n<=0){
                break;
            }
            else{
                if(n>=denominations[i]){
                    res.add(denominations[i]);
                    n-=denominations[i];
                    i--;
                }
            }
        }

        for(int i=0; i<res.size(); i++){
            System.out.println(res.get(i));
        }
        System.out.println("Minimum no of coins are : "+res.size());
        sc.close();
    }
}
