# Collection
    - It is a Root Interface 
    - parent interface for list, set, map, queue etc.
    - Basic methods for adding, removing, and accessing elements.

# Comparable : 
    - It is a Interface
    - used for natural ordering of objects 
    - If i want to sort the objects inside a class then comparator is used but we can sort only on one parameter
    - We have to implements comparable interface
    - Inside that override the compareTo() method

    -static class Student implements Comparable<Student>{
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
     }

# Comparator 
    - This is alseo an interface
    - Comparator is used when you need flexibility, such as sorting by multiple fields or sorting objects outside their class.
    
    - Comparator has the compare(T o1, T o2) method
    - If i want to sort the objects insode or outside the class but we have to sort the objects on more than one parameter or multi parameter then we will used Comparator
    - It can be created by 2 ways
        1. Comparator object  // need to override the compare method
        2. Lambda function   // it implicitly treated as compare method


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


        Comparator<Student> c = (s1, s2) -> {
            int ageComparison = Integer.compare(s1.age, s2.age);
            if (ageComparison != 0) {
                return ageComparison;
            }
            return s1.name.compareTo(s2.name);
        };
        
        PriorityQueue<Student> pq = new PriorityQueue<>(c);


