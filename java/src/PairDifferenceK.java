package src;
import java.util.Arrays;

public class PairDifferenceK {
    public static int countPairs(int[] arr, int k) {
        Arrays.sort(arr);

        int left = 0;
        int right = 1;
        int count = 0;

        while (right < arr.length) {

            int diff = arr[right] - arr[left];

            if (diff == k) {
                count++;
                left++;
                right++;
            }
            else if (diff < k) {
                right++;
            }
            else {
                left++;
            }

            if (left == right) right++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7};
        int k = 2;

        System.out.println(countPairs(arr, k));
    }
}
