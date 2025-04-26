package Arrays;

import java.util.Arrays;

public class A01_Inbuilt_Functions {

    public static void main(String[] args) {

        int arr[] = {5,3,7,1,9};

        //----------------------    toString()    o(n) --------------------------- 
        System.out.println("************    toString()   **************");

        String str = Arrays.toString(arr);    
        System.out.println(str);                //[5, 3, 7, 1, 9]
        System.out.println(str.length());       //15

        //----------------------    sort    o(nlogn) ---------------------------
        System.out.println("************    sort     **************");

        Arrays.sort(arr);     //1 3 5 7 9

        //----------------------    binarySearch    o(logn) ---------------------------
        System.out.println("************   binarySearch    **************");

        int idx = Arrays.binarySearch(arr, 7);
        System.out.println("Key is present at index : "+idx);      //3


        //----------------------    equal    o(n) ---------------------------
        System.out.println("************   equal     **************");

        int arr2[] = {1,3,5,7,9};
        boolean res = Arrays.equals(arr, arr2);
        System.out.println(res);                    //true

        //----------------------    fill    o(n) ---------------------------
        System.out.println("************   fill    **************");

        Arrays.fill(arr,12);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);        //12 12 12 12 12
        }

        //----------------------    copyOf    o(n) ---------------------------
        System.out.println("************      copyOf        **************");

        int arr3[] = Arrays.copyOf(arr2, arr2.length);
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);        //1 3 5 7 9
        }

        System.out.println("_____________________________________________");
        int arr4[] = {11,12,13};
        System.out.println("The size of arr4 is : "+arr4.length);
        arr4 = Arrays.copyOf(arr3, arr3.length);    
        for(int i=0; i<arr4.length; i++){
            System.out.println(arr4[i]);        //1 3 5 7 9
        }
        System.out.println("The size of arr4 after coping elements  is : "+arr4.length);
         //----------------------    copyOfRange    o(n) ---------------------------
        System.out.println("************     copyOfRange        **************");

        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);        //1 3 5 7 9
        }

        arr3= Arrays.copyOfRange(arr2, 2 ,5);

        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);        //5 7 9
        }

    }
}
