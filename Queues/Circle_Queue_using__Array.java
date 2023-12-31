public class Circle_Queue_using__Array {
    static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull (){
            return (rear + 1) % size == front;
        }

        // add 
        public static void add(int data){

            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // add first element
            if (front == -1) {
                front = 0; // first index
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        

    }
    
}
