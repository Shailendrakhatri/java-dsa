package src;
import java.util.*;
public class SimpleQueue {

    private HashMap<Integer, Integer> queue;
    private int front;
    private int rear;

    public SimpleQueue() {
        queue = new HashMap<>();
        front = 0;
        rear = 0;
    }

    // Add element
    public void enqueue(int data) {
        queue.put(rear, data);
        rear++;
    }

    // Remove element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue.get(front);
        queue.remove(front);
        front++;
        return value;
    }

    // Check front element
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return queue.get(front);
    }

    public boolean isEmpty() {
        return front == rear;
    }
    public class Main {
        public static void main(String[] args) {
            SimpleQueue q = new SimpleQueue();

            q.enqueue(5);
            q.enqueue(15);
            q.enqueue(25);

            System.out.println(q.dequeue()); // 5
            System.out.println(q.peek());    // 15
        }
    }
}
