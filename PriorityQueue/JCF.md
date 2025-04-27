# JCF : Java Collection Framwork

    - It is a consistent and standard architecture in java
    - It has some Data Structures and algorithms to manipulate the group of objects

    # Data Structure : 
        - List
        - Map
        - Queue
        - Set

    # Algorithms
        - Searching
        - Sorting

    # Interface
        Collection

    # Sub - Interfaces 
        - List
        - Map
        - Queue
        - Set

    # Classes 
        - List               : ArrayList, LinkedList
        - Map                : HashMap, Linked HashMpa, TreeMap 
        - Queue              : Priority Queue
        - Set                : HashMap, Linked HashMap, TreeMap


    # Methods
        - add(E e): Adds an element to the collection.
        - remove(Object o): Removes a specified element.
        - size(): Returns the number of elements in the collection.
        - isEmpty(): Checks if the collection is empty.



        Operation	|    HashMap   |	   LinkedHashMap  |	  TreeMap
                    |              |                      |
        insertion   |     o(1)     |         o(1)         |    o(logn) 
        deletion    |     o(1)     |         o(1)         |    o(logn) 
        Search      |     o(1)     |         o(1)         |    o(logn) 
        Ordering    |    Unordered |        insertion     |  Unordered
                    |              |         order        |
        space       |     o(n)     |         o(n)         |      o(n)
                    |              |                      |
        implemented |     Arrays   |        Doubly        |      Red
                    |      of      |       LinkedList     |     Black
                    |  LinkedList  |                      |     Tree
    