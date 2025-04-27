package Heaps;

import java.util.*;


public class H03_Delete_From_MinHeap {
    static class Heaps{
        ArrayList <Integer> arr = new ArrayList<>();

        public void insertHeap(int data){
            arr.add(data);
            
            int c_idx = arr.size()-1;
            int p_idx = (c_idx-1)/2;

            while(c_idx > 0 && arr.get(p_idx) > arr.get(c_idx)){
                int temp = arr.get(c_idx);
                arr.set(c_idx, arr.get(p_idx));
                arr.set(p_idx, temp);

                c_idx = p_idx;
                p_idx = (c_idx-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){   //top down appoch because it is alredy minheap & only 1 element was changed
            int min_idx = i;
            int left = 2*i + 1;
            int right = 2*i + 2;

            if(left < arr.size() && arr.get(left) < arr.get(min_idx)){ 
                min_idx = left;
            }
            if(right <arr.size() && arr.get(right) < arr.get(min_idx)){
                min_idx = right;
            }

            if(min_idx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(min_idx));
                arr.set(min_idx, temp);

                heapify(min_idx);
            }
        }

        public int deleteHeap(){
            int result = arr.get(0);

            //step 1: swap first and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step 2 : remove the last element
            arr.remove(arr.size()-1);

            //step 3 : correct the heap
            heapify(0);   // o(logn)
            return result;
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
        System.out.println("\nThe peek element of min heap : "+h.peek());

        System.out.println("The element to be deleted : "+h.deleteHeap());
        
        h.printArr();
    }
}
