package Heaps;

import java.util.ArrayList;

public class H04_Delete_From_MaxHeap {
    static class Heaps{
        ArrayList <Integer> arr = new ArrayList<>();

        public void insertHeap(int data){ //maxHeap
            arr.add(data);
            int c_idx = arr.size()-1;
            int p_idx = (c_idx -1)/2;

            while(c_idx > 0 && arr.get(p_idx) < arr.get(c_idx)){
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

        private void heapify(int i){
            int max_idx = i;
            int left = 2*i + 1;
            int right = 2*i + 2;

            if(left < arr.size() && arr.get(left) > arr.get(max_idx)){
                max_idx = left;
            }

            if(right < arr.size() && arr.get(right) > arr.get(max_idx)){
                max_idx = right;
            }

            if(max_idx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(max_idx));
                arr.set(max_idx, temp);

                heapify(max_idx);
            }
        }
        public int deleteHeap(){
            int result = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            arr.remove(arr.size()-1);
            heapify(0);
            return result;
        }

        public void printArr(){
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("MaxHeap");

        Heaps h = new Heaps();

        h.insertHeap(10);
        h.insertHeap(5);
        h.insertHeap(20);
        h.insertHeap(1);
        h.printArr();
        System.out.println("\nThe peek element of max heap : "+h.peek());

        System.out.println("The element to be deleted : "+h.deleteHeap());
        
        h.printArr();
    }
}
