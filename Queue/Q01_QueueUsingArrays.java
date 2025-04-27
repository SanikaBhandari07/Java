package Queue;

public class Q01_QueueUsingArrays {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            size = n;
            arr  = new int[size];
            rear = -1;
        }

        public boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            return false;
        }
        public boolean isFull(){
            if(rear == size-1){
                return true;
            }
            return false;
        }

        public void  add(int data){
            if(isFull()){
                System.out.println("The stack is Empty");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("The queue is Empty");
                return -1;
            }
            int top = arr[0];
            for(int i=1; i<arr.length;i++){
                arr[i-1] = arr[i];
            }
            rear--;
            return top;

        }

        public int peek(){
            if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            
            System.out.println(q.peek());
            q.pop();
        }
    }
}
