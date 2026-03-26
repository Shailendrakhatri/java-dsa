package src;
import java.util.*;
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char t : tasks) freq[t - 'A']++;

        Arrays.sort(freq);

        int max = freq[25] - 1;
        int idle = max * n;

        for (int i = 24; i >= 0 && freq[i] > 0; i--) {
            idle -= Math.min(freq[i], max);
        }

        return idle > 0 ? idle + tasks.length : tasks.length;
    }
}
