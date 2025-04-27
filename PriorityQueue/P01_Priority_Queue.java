package PriorityQueue;

import java.util.PriorityQueue;

public class P01_Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(4);
        pq.add(1);
        pq.add(10);
        pq.add(-1);

        while(!pq.isEmpty()){
            System.out.print(pq.peek() +" ");
            pq.remove();
        }
    }
}
