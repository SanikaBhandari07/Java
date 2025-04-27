
// Given an array of integers, reorder the elements such 
// that elements with higher frequencies appear earlier.

package PriorityQueue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class P12_Array_Reordering_Frequency {
    static class Frequency implements Comparable<Frequency>{
        int val;
        int freq;
        public Frequency(int val, int freq){
            this.val = val;
            this.freq  = freq;
        }

        @Override
        public int compareTo(Frequency f){
            return f.freq - this.freq;
        }

    }
    public static void main(String[] args) {
        int arr[] = {4, 4, 6, 7, 4, 6,1};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        HashMap <Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hs.put(arr[i], hs.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue <Frequency> pq = new PriorityQueue<>();
        for(Integer i : hs.keySet()){
            pq.add(new Frequency(i, hs.get(i)));
        }
        int j =0;

        while(!pq.isEmpty()){
            Frequency f = pq.remove();
            int i=0;
            while(i<f.freq){
                arr[j] = f.val;
                j++;
                i++;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
