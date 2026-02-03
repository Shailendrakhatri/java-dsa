import java.util.*;

public class StackBasics {
    // Stack using ArrayList
//    static class StackAL {
//        static  ArrayList<Integer> list = new ArrayList<>();
//        public static boolean isEmpty(){
//            return list.size() ==0;
//        }
//        //to push O(1)
//        public static void push(int data){
//            list.add(data);
//        }
//        //to pop O(1)
//        public static int  pop(){
//            if (isEmpty()) {
//                System.out.println("Stack is empty");
//                return -1;
//            }else{
//                int top = list.get(list.size()-1);
//                list.remove(list.size()-1);
//                return top;
//            }
//        }
//        //tp peek o(1)
//        public static int  peek(){
//            if (isEmpty()){
//                System.out.println("Stack is empty");
//                return -1;
//            }else{
//                return list.get(list.size()-1);
//            }
//        }
//    }

    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // to reverse a String using stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx <str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return  result.toString();
    }
    // to reversea an stack
    public static void reverseStack(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
    }


    public static void main(String[] args) {
//        StackAL stack = new StackAL();
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        pushAtBottom(stack, 4);
//        while(!stack.isEmpty()){
//            System.out.println(stack.peek());
//            stack.pop();
//        }

        //for reversing a string
//        String str = "professor";
//        String reversed = reverseString(str);
//        System.out.println(reversed);
        // for reversing a stack
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

//        printStack(s);
        reverseStack(s);
        printStack(s);

    }
}
