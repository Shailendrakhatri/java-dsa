package src;

public class Doubly_LinkedList {

    // Node class
    static class DoublyNode {
        int data;
        DoublyNode prev;
        DoublyNode next;

        DoublyNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Queue using Doubly Linked List
    static class QueueDLL {
        private DoublyNode front, rear;

        public QueueDLL() {
            front = rear = null;
        }

        // Enqueue
        public void enqueue(int data) {
            DoublyNode newNode = new DoublyNode(data);

            if (rear == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }

        // Dequeue
        public int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }

            int value = front.data;
            front = front.next;

            if (front != null)
                front.prev = null;
            else
                rear = null;

            return value;
        }

        // Peek
        public int peek() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        // Display
        public void display() {
            DoublyNode temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        QueueDLL q = new QueueDLL();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();                  // 10 20 30
        System.out.println(q.dequeue()); // 10
        q.display();                  // 20 30
        System.out.println(q.peek());    // 20
    }
}