package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P04_Priority_Queue_For_Objects_Using_Comparator {

    static class Student{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                    int ageComparison = Integer.compare(s1.rank, s2.rank);
                    if (ageComparison != 0) {
                        return ageComparison;
                    }
                    return s1.name.compareTo(s2.name);
                }
        });

       

        pq.add(new Student("John",18));
        pq.add(new Student("Alice",18));
        pq.add(new Student( "Bob",20));
        pq.add(new Student("Zara",20));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name +"   "+pq.peek().rank);  // Elements are returned in sorted order
            pq.remove();
        }
    }
}
