package src;
import java.util.*;

public class GenerateBinary {
    public static void generate(int n) {
        Queue<String> q = new LinkedList<>();
        q.offer("1");

        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.print(curr + " ");

            q.offer(curr + "0");
            q.offer(curr + "1");
        }
    }
}
