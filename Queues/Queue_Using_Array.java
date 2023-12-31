public class Queue_Using_Array {
    
    static class Queue {
       static int arr [];
       static int size;
       static int rear;

    //     Constructor
    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1; // because rear -1 because the size is never negative
    }

    //  queue is EmptyQueue
    public static boolean isEmpty (){
        return rear == -1;     
    }

    // Add or push
    public static void add(int data){
        if (rear == size -1) {
            System.out.println("Queue is Full");
            return;
        }

        rear = rear + 1;
        arr[rear] = data;
    } 

    // Delete or remove or pop
    public static int remove(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int front = arr[0]; // first inde

        //  to shift the elements last
        for(int i = 0 ; i < rear; i++){
            arr[i] = arr[i+1];
        }
        rear = rear - 1;
        return front;

    }

    // peek
    public static int peek(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
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

        // for printing
        while (!q.isEmpty()) {
           System.out.println(q.peek());
           q.remove();

        }
    }
    
}
