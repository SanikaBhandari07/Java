package Heaps;

public class H06_Heap_Sort_Descending_Order {

    static class Heaps{

        public void heapify(int arr[], int i, int size){
            int min_idx = i;
            int left = 2*i + 1;
            int right = 2*i + 2;

            if(left < size && arr[left] < arr[min_idx]){
                min_idx = left;
            }

            if(right < size && arr[right] < arr[min_idx]){
                min_idx = right;
            }

            if(min_idx != i){
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;

                heapify(arr, min_idx, size);
            }
        }
        public void heap_sort(int arr[]){
            int n = arr.length;
            //step 1 : create min_heap
            for(int i=n/2; i>=0; i--){
                heapify(arr,i,n);
            }

            for(int i=n-1; i>0; i--){
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr,0,i);
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
        int arr[] = {8,7,4,2,3};    

        System.out.println("The Max Heap is");
        h.printArr(arr);
    
        h.heap_sort(arr);

        System.out.println("\nThe Descending Order is");
        h.printArr(arr);
    }
        
}
