// Given an array of integers, find the Kth largest element at any point 
// while traversing the array. 
// As you process each element, update the Kth largest element dynamically.


package PriorityQueue;

import java.util.PriorityQueue;
public class P10_Kth_Largest_Element_At_Any_Point {

    public static void printArr(PriorityQueue<Integer> pq){
        for (Integer element : pq) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 11, 70, 50, 40, 100,5};
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        int k = 3; 
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        System.out.println(pq.peek());
        for(int i=k; i<arr.length; i++){
            if(arr[i] > pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
            System.out.println(pq.peek());
        }
        
    }
}
