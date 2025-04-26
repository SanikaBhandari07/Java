package Arrays;

public class A03_Maximum_Minimum_Elements {

    public static void first_Max(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max Element is :"+max);
        System.out.println("Min Element is "+min);
    }


    public static void second_Max(int arr[]){

        int max1 = Integer.MIN_VALUE+1;
        int max2 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MIN_VALUE-1;

        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else{
                if(arr[i] > max2){
                    max2 = arr[i];
                }
            }

            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }
            else{
                if(arr[i] < min2){
                    min2 = arr[i];
                }
            }
        }
        System.out.println("Maximum elements : "+max1 + "  "+ max2);
        System.out.println("Minimum elements : "+min1 + "  "+ min2);

    }

    public static void third_Max(int arr[]){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE + 1;
        int max3 = Integer.MIN_VALUE + 2;

        int min3 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE - 1;
        int min1 = Integer.MAX_VALUE - 2;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else{
                if(arr[i]>max2){
                    max3 = max2;
                    max2 = arr[i];
                }
                else{
                    if(arr[i] > max3){
                        max3 = arr[i];
                    }
                }
            }

            if(arr[i] < min1){
                min3 = min2;
                min2 = min1;
                min1 = arr[i];
            }
            else{
                if(arr[i] < min2){
                    min3 = min2;
                    min2 = arr[i];
                }
                else{
                    if(arr[i] < min3){
                        min3 = arr[i];
                    }
                }
            }
        }
        System.out.println("Maximum Elements : "+ max1+ " "+max2+"  "+max3);
        System.out.println("Minimuym ELements :  "+min1 +"  "+min2+" "+min3);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,4,7,8,1,12,2,6};
        first_Max(arr);
        second_Max(arr);
        third_Max(arr);
        
    }
}
