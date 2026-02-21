package src;

public class CircularLL_Search {

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

        static boolean search(int key) {
            Node temp = head;
            do {
                if (temp.data == key)
                    return true;
                temp = temp.next;
            } while (temp != head);
            return false;
        }

        public static void main(String[] args) {
            insert(5);
            insert(15);
            insert(25);
            System.out.println(search(15)); // true
            System.out.println(search(50)); // false
        }
    }

