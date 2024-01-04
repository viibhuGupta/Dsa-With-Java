#include <iostream>
using namespace std;

class Queue {
public:
    static int* arr;
    static int size;
    static int rear;

    // Constructor
    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1; // because rear is initialized to -1 when the queue is empty
    }

    // Queue is Empty
    static bool isEmpty() {
        return rear == -1;
    }

    // Add or Enqueue
    static void add(int data) {
        if (rear == size - 1) {
            cout << "Queue is Full" << endl;
            return;
        }

        rear = rear + 1;
        arr[rear] = data;
    }

    // Remove or Dequeue
    static int remove() {
        if (isEmpty()) {
            cout << "Queue is Empty" << endl;
            return -1;
        }
        int front = arr[0];

        // Shift the elements to the left
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear = rear - 1;
        return front;
    }

    // Peek
    static int peek() {
        if (isEmpty()) {
            cout << "Queue is Empty" << endl;
            return -1;
        }
        return arr[0];
    }
};

// Initialize static members
int* Queue::arr = nullptr;
int Queue::size = 0;
int Queue::rear = -1;

int main() {
    Queue q(5);

    q.add(1);
    q.add(2);
    q.add(3);

    // Print elements
    while (!q.isEmpty()) {
        cout << q.peek() << endl;
        q.remove();
    }

    delete[] Queue::arr; // Free the allocated memory

    return 0;
}
