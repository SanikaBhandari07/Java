
// Given an array of integers and a window size k,
// find the maximum value in each sliding window of size k.

package PriorityQueue;

import java.util.PriorityQueue;

public class P11_Sliding_Window_maximum {

    static class Slide implements Comparable<Slide>{
        int val;
        int idx;

        Slide(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Slide s2){
            return s2.val - this.val;
        }
    }

    public static int[] slinding_window(int arr[], int k){
        int n = arr.length;
        int res[] = new int[n-k+1];
        PriorityQueue <Slide> pq = new PriorityQueue<>();

        for(int i=0; i<k-1; i++){
            pq.add(new Slide(arr[i], i));
        }
        int j = 0;

        for(int i=k-1; i<arr.length; i++){
            
            pq.add(new Slide(arr[i], i));
            res[j] = pq.peek().val;
            j++;

            while(pq.peek().idx <= (i-k)){
                pq.remove();
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int res[] = slinding_window(arr,k);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
