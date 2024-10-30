
// -------------------------------------------------------------------------------------


//Choose the maximum number of non-overlapping activities from a list, 
//where each activity has a start and end time.



// -------------------------------------------------------------------------------------

//----------------------          End Time is Sorted :           -----------------------


// import java.util.*;

// public class Activity_Selection{
//     public static void main(String args[]){
//         int start[] = {1,3,0,5,8,5};
//         int end[] = {2,4,6,7,9,9};

//         int count = 0;
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(0);
//         count = 1;
//         int endtime = end[0];

//         for(int i=1; i<start.length; i++){
//             if(start[i]>=endtime){
//                 count++;
//                 arr.add(i);
//                 endtime = end[i];
//             }
//         }
//         System.out.println("Count is : "+count);
//         for(int i=0; i<arr.size(); i++){
//             System.out.println("A"+arr.get(i));
//         }
//     }
// }



//----------------------          End Time is Not Sorted :           -----------------------


import java.util.*;

public class G01_Activity_Selection{
    public static void main(String args[]){

        int start[] = {0,1,3,5,5,8};
        int end[] = {6,2,4,7,9,9};

        int activity[][] = new int[start.length][3];

        for(int i=0; i<start.length; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(activity[0][0]);
        count = 1;
        int endtime = activity[0][2];

        for(int i=1; i<activity.length; i++){
            if(activity[i][1] >= endtime){
                count ++;
                arr.add(activity[i][0]);
                endtime = activity[i][2];

            }
        }

        System.out.println("Count : "+count);
        for(int i=0; i<arr.size(); i++){
            System.out.println("A"+arr.get(i));
        }

    }
}