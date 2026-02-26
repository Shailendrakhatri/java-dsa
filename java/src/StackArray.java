package src;

public class StackArray {
    int[] stack;
    int top;
    int size;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
