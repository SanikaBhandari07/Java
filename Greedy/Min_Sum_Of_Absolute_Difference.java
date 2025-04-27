import java.util.*;
public class Min_Sum_Of_Absolute_Difference {
    public static void main(String args[]){
        int A[] = {1,2,3};
        int B[] = {2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;

        for(int i=0; i<A.length; i++){
            sum += Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum absolute differences is : "+sum);
    }
}
