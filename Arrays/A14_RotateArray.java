package Arrays;

public class A14_RotateArray {

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void rotate(int arr[],int k){
        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr, 0, arr.length-k-1);
        reverseArray(arr, arr.length-k, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        System.out.print("Array before rotation : ");
        print(arr);
        rotate(arr,k);
        System.out.print("Array after rotation  : ");
        print(arr);
    }
}
