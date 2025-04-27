package Queue;

public class Q02_CirculorQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n){
            size = n;
            arr = new int[size];
            front = -1;
            rear = -1;
        }

        public boolean isEmpty(){
            return rear== -1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public void add(int data){
            if(isFull()){
                System.out.println("The Queue is Full");
                return;
            }
            
            if(front==-1){  // 0 element
                front=0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("The queue is Empty");
                return -1;
            }
            int top = arr[front];
            if(front==rear){       //1 element
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return top;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("The queue is full");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}