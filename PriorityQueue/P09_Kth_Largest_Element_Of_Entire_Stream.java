
//Given an array of integers, find the Kth largest element in the entire array.



package PriorityQueue;

import java.util.PriorityQueue;

public class P09_Kth_Largest_Element_Of_Entire_Stream {
    public static void main(String[] args) {
        int arr[] = {10, 20, 11, 70, 50, 40, 100, 5};
        int k = 3;

        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }

        
        System.out.println(k+"th largest element :"+pq.peek());

    }
}
