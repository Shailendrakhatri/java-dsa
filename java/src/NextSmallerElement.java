package src;
import java.util.*;

public class NextSmallerElement {
    public static void findNSE(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            int nse = stack.isEmpty() ? -1 : stack.peek();
            System.out.println(arr[i] + " -> " + nse);

            stack.push(arr[i]);
        }
    }
}
