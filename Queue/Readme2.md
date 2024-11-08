
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





