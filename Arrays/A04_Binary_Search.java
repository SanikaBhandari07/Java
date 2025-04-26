// package Arrays;

public class A04_Binary_Search {

    public static int binary_search(int arr[], int key){
        if(key<arr[0] || key >arr[arr.length-1]){
            return -1;
        }
        else{
            int left = 0;
            int right = arr.length-1;
            while(left <= right){
                int mid = left + (right-left)/2;   //(left + right)/2 in this case for large integers
                if(arr[mid] == key){                // left + right may be overflow the integer limit
                    return mid;
                }
                else if(key < arr[mid]){
                    right = mid-1;
                }
                else{
                    left = mid + 1;
                }
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int key = 10;
        int res = binary_search(arr,key);
        if(res == -1){
            System.out.println("This key is not exist");
        }
        else{
            System.out.println("Key is exist at index "+res);
        }
    }
}
