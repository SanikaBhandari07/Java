package Arrays;

public class A15_Merge_2_Sorted_Aray {

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void merge(int arr1[], int arr2[], int n){
        int i=n-1;
        int j = arr2.length-1;

        for(int k = arr1.length-1; k>=0; k--){

            if(i >= 0  && (j<0 || arr1[i] > arr2[j])){
                arr1[k] = arr1[i];
                i--;
            }
            else{
                if(j>=0){
                    arr1[k] = arr2[j];
                    j--;
                }
            }

        }
        
    }
    public static void main(String[] args) {
        int arr1[] = {1,5,6,0,0,0,0};
        int arr2[] = {2,3,4,7};
        int n = 3;
        merge(arr1,arr2,n);
        print(arr1);
    }
}
