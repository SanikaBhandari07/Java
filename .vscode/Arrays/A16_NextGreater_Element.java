
// package Arrays;

// public class A16_NextGreater_Element {

//     public static int[] next_greater(int arr[]){
//         int n = arr.length;
        
//         int next = arr[n-1];
//         int max = n-1;
//         int res [] = new int[arr.length];
//         res[n-1] = -1;

//         for(int i=n-2; i>=0; i--){
//             int curr = arr[i];
//             if(curr >= next){
//                 if(curr>=arr[max]){
//                     res[i] = -1;
//                     max = i;
//                 }
//                 else{
                    
//                     for(int j=i+1; j<=max; j++){
//                         if(arr[j] > curr){
//                             res[i] = arr[j];
//                             break;
//                         }
//                     }
                   
//                 }
//             }
//             else{
//                 res[i] = next;
//             }
//             next = arr[i];
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = { 41 ,88 ,58, 69, 93, 42, 44, 25, 12, 47, 41, 88, 58, 69, 93, 42, 44, 25, 12, 47 };
//         int res[] = next_greater(arr);
//         for(int i=0; i<arr.length; i++){
//             System.out.print(res[i]+" ");
//         }
        
//     }
// }
//41 88 58 69 93 42 44 25 12 47 41 88 58 69 93 42 44 25 12 47

package Arrays;

public class A16_NextGreater_Element {

    public static int[] next_greater(int arr[]){
        int n = arr.length;
        int next = arr[n - 1];
        int max = n - 1;
        int res[] = new int[n];
        res[n - 1] = -1;  // Last element has no next greater element

        for (int i = n - 2; i >= 0; i--) {
            int curr = arr[i];
            if (curr >= next) {
                if (curr >= arr[max]) {
                    res[i] = -1;
                    max = i;
                } else {
                    res[i] = arr[max];
                }
            } else {
                res[i] = next;
            }
            next = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 41 ,88 ,58, 69, 93, 42, 44, 25, 12, 47, 41, 88, 58, 69, 93, 42, 44, 25, 12, 47 };
        int res[] = next_greater(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

