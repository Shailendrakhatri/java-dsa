import java.util.*;

public class StackBasics {
    // Stack using ArrayList
    static class StackAL {
        static  ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() ==0;
        }
        //to push O(1)
        public static void push(int data){
            list.add(data);
        }
        //to pop O(1)
        public static int  pop(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }else{
                int top = list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
            }
        }
        //tp peek o(1)
        public static int  peek(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }else{
                return list.get(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        StackAL stack = new StackAL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
