package Arrays;
import java.util.*;
public class doubt {
   public static void main(String[] args) {
    int arr[]  = {1,2,3,4,5};
    int arr2[] = new int[3];
    arr2[0] = 7;
    arr2[1] = 8;
    arr2[2] = 9;
    arr=arr2;
    System.out.println(arr.length);

    for(int i=0; i<arr2.length; i++){
        System.out.print(arr2[i]+" ");
    }

    System.out.println();

    arr2 = Arrays.copyOf(arr, arr.length);

    for(int i=0; i<arr2.length; i++){
        System.out.print(arr2[i]+" ");
    }
   } 
}
