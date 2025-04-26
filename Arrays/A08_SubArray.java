package Arrays;

public class A08_SubArray{

    public static void subArray(int arr[]){
        for(int i=0; i<arr.length; i++){   //start
            for(int j=i; j<arr.length; j++){   //end
                for(int k=i;k<=j;k++){          //mid
                    System.out.print(arr[k]+" ");
                }
                System.out.print("    ");
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArray(arr);
    }
}
