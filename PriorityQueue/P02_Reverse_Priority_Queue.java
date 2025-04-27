package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P02_Reverse_Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
