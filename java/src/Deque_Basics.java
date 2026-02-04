import java.util.*;
public class Deque_Basics {
    //create a stack using deque
    static class Stack {
        java.util.Deque<Integer> deque = new java.util.LinkedList<>();
        public void push(int data) {
            deque.addFirst(data);
        }
        public int pop() {
            return deque.removeFirst();
        }
        public int peek() {
            return deque.getFirst();
        }
    }

    //create a queue using deque
    static class Queue {
        java.util.Deque<Integer> deque = new java.util.LinkedList<>();
        public void add(int data) {
            deque.addLast(data);
        }
        public int remove() {
            return deque.removeFirst();
        }
        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args){
//        java.util.Deque<Integer> deque = new java.util.LinkedList<>();
//        deque.addFirst(10);
//        deque.addLast(9);
//        deque.addFirst(8);
//        System.out.println(deque);
//        deque.removeFirst();
//        System.out.println(deque);
//        deque.removeLast();
//        System.out.println(deque);

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());

    }
}
