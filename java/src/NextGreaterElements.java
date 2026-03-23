package src;
import java.util.*;

public class NextGreaterElements {
    public static void findNGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            int nge = stack.isEmpty() ? -1 : stack.peek();
            System.out.println(arr[i] + " -> " + nge);

            stack.push(arr[i]);
        }
    }
}
