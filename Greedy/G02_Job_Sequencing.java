import java.util.*;
public class G02_Job_Sequencing {

    static class Job{

        int id;
        int deadline;
        int profit;

        Job(int id, int deadline,int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {

       int jobInfo[][] = {{4,20}, {1,10},{1,40},{1,30}} ;
        ArrayList <Job> arr = new ArrayList<>();

        for(int i=0; i<jobInfo.length; i++){
            arr.add(new Job(i,jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(arr, (obj1, obj2)-> obj2.profit-obj1.profit);
        ArrayList <Character> res = new ArrayList<>();
        int time = 0;
        int profit = 0;


        for(int i=0; i<arr.size(); i++){
            if(arr.get(i).deadline > time){
                time++;
                profit += arr.get(i).profit;
                res.add((char)('a'+arr.get(i).id));
            }
        }

        for(int i=0; i<res.size();i++){
            System.out.print((res.get(i)+" "));
        }
        System.out.println("\nThe Profit is : "+profit);
    }
}
