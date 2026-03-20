package src;
import java.util.*;

public class FirstNonRepeating {
    static void find(String str) {
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            if (q.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(q.peek() + " ");
        }
    }

    public static void main(String[] args) {
        find("aabc");
    }
}
