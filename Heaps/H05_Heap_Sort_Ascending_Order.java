package Heaps;

public class H05_Heap_Sort_Ascending_Order {
    static class Heaps{

        public void heapify(int arr[], int i, int size){  
            int max_idx = i;
            int left = 2*i + 1;
            int right= 2*i + 2;

            if(left < size && arr[left] > arr[max_idx]){  //size is 0 based indexing
                max_idx = left;
            }
            if(right < size && arr[right] > arr[max_idx]){
                max_idx = right;
            }

            if(max_idx!=i){
                int temp = arr[i];
                arr[i] = arr[max_idx];
                arr[max_idx] = temp;

                heapify(arr,max_idx,size);
            }
        }
        public void heap_sort(int arr[]){
            //step 1  : create maxheap
            // down-up Approch because we have to convert minheap to maxheap
            int n = arr.length;
            for(int i=n/2; i>=0; i--){
                heapify(arr,i,n);         //  o(n/2 * logn) = o(nlogn)
            }

            //step 2 : swap first & last element
            for(int i=n-1; i>0; i--){
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr,0,i);   //top down because it is alredy in maxheap 
                                    //we just changed the one element of it
                                    //  o(nlogn)
            }
        }

        public void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Heaps h = new Heaps();
        int arr[] = {1,2,4,5,3};
        System.out.println("The Min Heap is");
        h.printArr(arr);
    
        h.heap_sort(arr);

        System.out.println("\nThe ascending order is");
        h.printArr(arr);
        
    }
}
