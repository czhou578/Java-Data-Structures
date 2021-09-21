package src;

public class Queue {
    private int arr[];
    private int front;
    private int back;
    private int capacity;
    private int count;

    Queue (int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        back = -1;
        count = 0;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Is Empty");
            System.exit(1);
        };
        front = (front + 1) % capacity;
        count--;
        System.out.println("removed");
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.exit(1);
        }

        back = (back + 1) % capacity;
        arr[back] = item;
        count++;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Is Empty");
            System.exit(1);
        }
        return arr[front];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == capacity;
    }

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(4);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(9);
    
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
