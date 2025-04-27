
// You are given a grid where each row represents a group of soldiers,
// and 1 means a soldier is present while 0 means no soldier. 
// Rows with fewer 1s are considered weaker. 
// and if the soilders are same then the ith soilder is weaker than jth row  if i<j
// Find the k weakest rows (groups of soldiers) in the grid.

package PriorityQueue;

import java.util.PriorityQueue;

public class P08_Weakest_Soilders {

    static class Soilder implements Comparable<Soilder>{
        int Soilder;
        int idx;

        public Soilder(int Soilder, int idx){
            this.Soilder = Soilder;
            this.idx = idx;
        }

        @Override
        public int compareTo(Soilder s2){
            if(this.Soilder != s2.Soilder){
                return this.Soilder - s2.Soilder;
            }
            else{
                return this.idx - s2.idx;
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}
                    };
        int k = 2;
    PriorityQueue <Soilder> pq = new PriorityQueue<>();

    for(int i=0; i<army.length; i++){
        int count =0;
        for(int j=0; j<army[0].length; j++){
            if(army[i][j] == 1){
                count ++;
            }
        }
        pq.add(new Soilder(count, i));
    }

        for(int i=0; i<k; i++){
            System.out.println("S"+pq.remove().idx);
        }
    }
}
