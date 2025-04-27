package Queue;

import java.util.*;

public class Q100_Test {
    public static void main(String[] args) {
        int arr[] = {12,-1,-7,8,-15,30,16,28};
        int p = 3;
        int n = arr.length;

        Queue<Integer> q = new LinkedList<>();
        int res [] = new int[n-p+1];
        int k=0;
        int t=0;
        while(t<(p-1)){
            q.add(arr[t]);
            t++;
        }
        for(int j=0; j<res.length; j++){

            q.add(arr[j+p-1]);
            
            System.out.println("");
            for(int key : q){
                if(key<0){
                    res[k] = key;
                    break;
                }
            }
            k++;

            q.remove();

            
        }

        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
        
    }


}




