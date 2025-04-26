package Arrays;

public class A11_max_subArraySum_KadanesAlgo {

    public static int max_subArraySum3(int arr[]){
        int curr = arr[0];
        int max = arr[0];

        for(int i=1; i<arr.length; i++){            
            curr = Math.max(arr[i], curr+arr[i]);   // -30  -70   100  120
            max = Math.max(curr,max);               // 10    10   100   120
        } 
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {10,-40,-70, 100,20};
        int sum = max_subArraySum3(arr);
        System.out.println("Maximum sum of subAray is : "+sum);
    }
}


                // 1 2 -10 -3
        // curr    1 3 -7  -3
        // max     1 3  3  3 

        // Time complexity : o(n)
        // space complexity : o(1)

// +ve +ve  : addition (+ve)
// +ve -ve  : +ve - -ve subtaction 
// -ve -ve  : depends wither -ve-ve is more or -ve is more
