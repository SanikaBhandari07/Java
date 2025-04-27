package Heaps;

import java.util.ArrayList;

public class H02_peek {
    static class Heap{
        ArrayList <Integer> arr = new ArrayList<>();

        public void insertHeap(int data){
            arr.add(data);

            int c_idx = arr.size()-1;
            int p_idx = (c_idx-1)/2;

            while(arr.get(p_idx) > arr.get(c_idx)){
                
                int temp = arr.get(c_idx);
                arr.set(c_idx , arr.get(p_idx));
                arr.set(p_idx, temp);

                c_idx = p_idx;
                p_idx = (c_idx-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public void printArr(){
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("MinHeap");
        Heap h = new Heap();

        h.insertHeap(10);
        h.insertHeap(5);
        h.insertHeap(20);
        h.insertHeap(1);
        h.printArr();

        System.out.println("\nThe peek element of min heap : "+h.peek());

    }
}
