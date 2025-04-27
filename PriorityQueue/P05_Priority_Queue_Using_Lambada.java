package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P05_Priority_Queue_Using_Lambada{
    static class Student {
        int age;
        String name;
        
        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }
    
        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
    public static void main(String[] args) {
       
        // PriorityQueue<Student> pq = new PriorityQueue<>((s1, s2) -> {
            
        //     int ageComparison = Integer.compare(s1.age, s2.age);
        //     if (ageComparison != 0) {
        //         return ageComparison;
        //     }
           
        //     return s1.name.compareTo(s2.name);
        // });
        
        Comparator<Student> c = (s1, s2) -> {
            int ageComparison = Integer.compare(s1.age, s2.age);
            if (ageComparison != 0) {
                return ageComparison;
            }
            return s1.name.compareTo(s2.name);
        };
        
        PriorityQueue<Student> pq = new PriorityQueue<>(c);

        
        pq.add(new Student(18, "John"));
        pq.add(new Student(18, "Alice"));
        pq.add(new Student(20, "Bob"));
        pq.add(new Student(20, "Zara"));

    
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  
        }
    }
}


