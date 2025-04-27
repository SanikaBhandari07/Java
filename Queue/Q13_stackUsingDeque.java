package Queue;

import java.util.*;

public class Q13_stackUsingDeque {
    static class stack{
        Deque <Integer> d = new LinkedList<>();

        public void push(int a){
            d.addLast(a);
        }

        public int pop(){
            return d.removeLast();
        }

        public int peek(){
            return d.getLast();
        }
        
        public boolean isEmpty(){
            return d.isEmpty();
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }


    }
}
