# Queue
    Queue interface is part of the java.util package and extends the Collection interface

    # FIFO data Structure
    # Interface
    # 2 Pointers :
        1) Front : Used for removing the element
        2) Rear  : Used for add the element

    # Time Complexity : 

        add       o(1)
        remove    o(1)
        peek      o(1) 

    # Operations


    1. add()        -- add an element  , if queue is full it returns exception
    2. offer()      -- if queue is full it returns false  .... 
                    it is also used in coping element from one to other

    3. remove()    -- gives nullpointerException if queue is empty
    4. poll()      -- it gives null if queue is empty

    5. peek()      --  retrived the peek element ,return null if queue is empty 
    6. element()   -- retrives the peek element , gives nullpointerException is queue is empty

    7. isEmpty()
    8. size()     the above 2 methods are in a collection framwork

# Queue Using Arrays

    # Time Complexity : 

        add       o(1)
        remove    o(n)
        peek      o(1)

    Disadvantage : 
        1) We have to specify the size
        2) It takes o(n) time for remove the element


# Circulor Queue with Array

    add       o(1)
    remove    o(1)
    peek      o(1)


    front = (front + 1 ) % size;
    rear  = (rear + 1 ) % size;

    1. initial condition :
        - Queue is Empty :
        - front = rear = -1;

    2. isEmpty()
        - when no element is added to Queue
        - front == rear == -1

    3. isFull()
        - when front is a next to the rear
        - (rear + 1) % size = front

    4. add()
         1. if Queue is Full then return 
         2. if front = -1 then front will be 0 and rear = 0
         3. else rear = (rear + 1) % size

    5. remove()
         1. if Queue is Empty then return
         2. store the arr[front] which will be returned
         3. if it is the last element then we have to define the both counter front & rear to -1
         4. front = (front + 1) % size;

    6. peek()
         1. if Queue is Empty the return
         2. return arr[front]


# Queue using Linked List
    
    add       o(1)
    remove    o(1)
    peek      o(1)


    1. isEmpty()
        1. when head == tail == null
    
    2. add()
        //First node
        1. head = tail = newNode
        
        2. else tail.next = newNode
                tail = newNode

    3. remove()
        1. Check for isEmpty()

        2. int res = head.data
        4. head = head.next

        3. //if it is a last node
            if head == null
            then tail = null

        5. return head;

    4. peek()
        1. Check for isEmpty()
        2. return head.data 

# Queue Using JCF (Java Collection Framework)

    Queue is a interface not a class
    Hence we cant creat a object of the Queue
    but Queue can be implemented using 2 ways

        1. by using linkedList
            Queue <Integer> q = new LinkedList<>();
        2.by using Arraydeque
            Queue <Integer> q = new ArrayDeque<>();

    add       o(1)
    remove    o(1)
    peek      o(1)

        

# Queue using 2 stacks

    1. q1 and q2 = 2 queues
    
    2. add
        if q1 is empty then add the element in q1
        else{
            pop the element from q1 and store it in q2
        }
        now push the elememnt in q1
        and pop the elements from q2 and store it in q1

    3. Remove
        if q1 is not empty 
        then q1.pop()
    
    4. peek()
         if q1 is not empty 
        then q1.peek()
    

# Stack Using 2 Queues

    1. q1 and q2 = 2 stacks
    
    2. add
        if q1 is empty then add the element in q1
        else{
            remove the element from q1 and store it in q2
        }
        now add the elememnt in q1
        and remove the elements from q2 and store it in q1

    3. Remove
        if q1 is not empty 
        then q1.remove()
    
    4. peek()
         if q1 is not empty 
        then q1.peek()
    

# We can traverse the queue without poping the elements

    for(int key : q){
        System.out.println(key)
    }

# We can Copy the elemenets from one queue to other 

    for(int key : q){
        q1.offer(key);
    }

# Real Time Example
 
1. Customer Service (Call Center) Queue:
2. Ticket Counter


#  Deque

    Double ended Queue

    Deque <Integer> d = new LinkedList<>();

    Operations 
        1. addFirst()
        2. addLast()
        3. removeFirst()
        4. removeLast()
        5. getFirst()
        6. getLast()
        7. isEmpty()


    We can implement stack and queue using deque

    Real Time Examples

    Browser History:

    1. Browser History
    When you browse web pages, you can go back to the previous page or forward to the next one.
    Use of Deque: A deque can store web pages visited. When you move back, pages are popped from the rear, and when you move forward, they are pushed from the front.
    Undo/Redo Operations:

    2. Undo and Redo Pages
    Scenario: In applications like text editors or drawing software, you can undo/redo actions.
    Use of Deque: One end of the deque stores undo operations (pushed as actions are made), while the other end is for redo operations. This allows efficient adding/removing of actions as you undo or redo. 

    3. Task Scheduling
    In real-time systems or OS schedulers, tasks may arrive in any order, and tasks need to be executed based on different priorities.
    Use of Deque: You can add tasks with different priorities at the front or rear based on the task urgency.




