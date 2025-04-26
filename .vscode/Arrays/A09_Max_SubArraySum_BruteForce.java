package Arrays;

public class A09_Max_SubArraySum_BruteForce {

    public static int max_subArraySum1(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            
            for(int j=i; j<arr.length;j++){
                sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
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
        int sum = max_subArraySum1(arr);
        System.out.println("Maximum sum of subAray is : "+sum);
    }
}
