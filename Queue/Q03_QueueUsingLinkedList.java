package Queue;

public class Q03_QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        Node head;
        Node tail;
        
        public boolean isEmpty(){
            return head==null && tail==null;
        }

        public void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=tail=newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int res = head.data;
            head = head.next;
            if(head==null){
                tail=null;
            }
            return res;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
