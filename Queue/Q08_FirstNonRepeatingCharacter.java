package Queue;

import java.util.*;

public class Q08_FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        char arr[] = {'a','a','b','c','c','x','b'};
        int freq[] = new int[26];
        Queue <Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){

            q.add(arr[i]);

            freq[arr[i]-'a']++; 

            while(!q.isEmpty()){
                if(freq[q.peek()-'a'] == 1){
                    sb.append(q.peek());
                    break;
                }
                else{
                    q.remove();
                }
            }
            if(q.isEmpty()){
                sb.append(-1);
            }
        }
        System.out.println(sb.toString());

    }
}
