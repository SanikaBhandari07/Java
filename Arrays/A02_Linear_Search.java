package Arrays;

public class A02_Linear_Search {

    public static int linear_search(int arr[], int key){
   
        for(int i=0; i<arr.length; i++){
            if(key==arr[i]){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
       
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 7;

        int index = linear_search(arr,key);
        if(index == -1){
            System.out.println("Key is not Found");
        }
        else{
            System.out.println("Key is found at index : "+index);
        }

    }
}
