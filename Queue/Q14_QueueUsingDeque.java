package Queue;

import java.util.*;

public class Q14_QueueUsingDeque {

    static class Queue1{

        Deque <Integer> d = new LinkedList<>();

        public void add(int data){
            d.addLast(data);
        }

        public int remove(){
            return d.removeFirst();
        }

        public int peek(){
            return d.getFirst();
        }

        public boolean isEmpty(){
            return d.isEmpty();
        }
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
