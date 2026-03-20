package src;
import java.util.*;

public class SlidingWindow {
    static void maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            // Remove out of window
            if (!dq.isEmpty() && dq.peek() == i - k)
                dq.poll();

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            dq.add(i);

            if (i >= k - 1)
                System.out.print(nums[dq.peek()] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        maxSlidingWindow(arr, 3);
    }


}
