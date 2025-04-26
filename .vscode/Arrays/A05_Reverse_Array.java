package Arrays;

public class A05_Reverse_Array {

    public static void reverseArray(int arr[]){
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        reverseArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
