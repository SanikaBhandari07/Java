
// You are given the lengths of ropes. You need to connect all the ropes into a single rope.
//  Each time you connect two ropes,
//  the cost is the sum of their lengths. Find the minimum cost to connect all the ropes.

package PriorityQueue;

import java.util.PriorityQueue;

public class P07_Connect_N_Ropes {
    public static void main(String[] args) {
        int ropes []= {2,3,3,4,6};
        int cost = 0;

        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }

        while(pq.size()>1){
            int min1 = pq.remove();
            int min2 = pq.remove();
            int c = min1 + min2;
            pq.add(c);
            cost += min1 + min2;
        }

        System.out.println("The Cost of Ropes : "+cost);
    }
}
