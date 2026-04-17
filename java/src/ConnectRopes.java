package src;
import java.util.*;


public class ConnectRopes {
    public int minCost(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int r : ropes) pq.offer(r);

        int cost = 0;

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            int sum = a + b;
            cost += sum;
            pq.offer(sum);
        }
        return cost;
    }
}
