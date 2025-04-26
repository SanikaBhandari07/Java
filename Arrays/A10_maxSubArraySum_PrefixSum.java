package Arrays;

public class A10_maxSubArraySum_PrefixSum{

    public static int max_subArraySum2(int arr[]){
        int prefix_sum [] = new int[arr.length];
        prefix_sum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
            
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(i == 0){
                    sum = prefix_sum[j];
                }
                else{
                    sum = prefix_sum[j] - prefix_sum[i-1];
                }
                
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,9,10};
        int sum = max_subArraySum2(arr);
        System.out.println("Maximum sum of subAray is : "+sum);
    }
}
