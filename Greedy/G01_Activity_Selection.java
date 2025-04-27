
//Choose the maximum number of non-overlapping activities from a list, 
//where each activity has a start and end time.


import java.util.*;

public class G01_Activity_Selection {
    public static void main(String[] args) {
        int start[] = {0,1,3,5,5,8};
        int end[] = {6,2,4,7,9,9};
        int arr[][] = new int[start.length][3];

        for(int i=0; i<arr.length; i++){
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        Arrays.sort(arr,Comparator.comparingDouble(o -> o[2]));
        int time = 0;
        ArrayList <Integer> res = new ArrayList<>();
        res.add(arr[0][0]);
        time = arr[0][2];
        for(int i=1; i<arr.length; i++){
            if(arr[i][1] >= time){
                res.add(arr[i][0]);
                time = arr[i][2];
            }
        }
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println("\nTotal No Of Activities are "+res.size());
    }
}
