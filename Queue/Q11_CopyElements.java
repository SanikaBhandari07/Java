package Queue;
import java.util.*;
public class Q11_CopyElements {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        Queue <Integer> q1 = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        for(int key : q){
            q1.offer(key);
        }

        while(!q1.isEmpty()){
            System.out.println(q1.remove());
        }
    }
}
