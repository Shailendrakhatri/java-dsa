package src;

class CircularLL_Count {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node head = null;

    static void insert(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    static int count() {
        int cnt = 0;
        Node temp = head;
        do {
            cnt++;
            temp = temp.next;
        } while (temp != head);
        return cnt;
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        System.out.println(count());
    }
}
