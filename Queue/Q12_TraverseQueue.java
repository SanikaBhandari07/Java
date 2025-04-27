package Queue;
import java.util.*;
public class Q12_TraverseQueue {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
       
        q.add(1);
        q.add(2);
        q.add(3);

        for(int key : q){
            System.out.println(key);
        }
    }
}
