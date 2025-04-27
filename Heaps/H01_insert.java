package Heaps;

import java.util.*;

public class H01_insert {

    static class Heaps{
        ArrayList <Integer> arr = new ArrayList<>();  //minheap

        public void insertHeap(int data){
            arr.add(data);

            int c_idx = arr.size()-1;
            int p_idx =(c_idx-1)/2;

            while(arr.get(p_idx) > arr.get(c_idx) ){

                int temp = arr.get(c_idx);
                arr.set(c_idx, arr.get(p_idx));
                arr.set(p_idx, temp);

                c_idx = p_idx;
                p_idx = (c_idx-1)/2;
            }
        }

        public void printArr(){
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
        }
    } 
    
    public static void main(String[] args) {
        System.out.println("MinHeap");

        Heaps h = new Heaps();

        h.insertHeap(10);
        h.insertHeap(5);
        h.insertHeap(20);
        h.insertHeap(1);
        h.printArr();
    }
}
