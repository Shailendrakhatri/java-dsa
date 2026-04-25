package src;
import java.util.Arrays;

public class ClosestPairSum {
    public static int closestSum(int[] arr, int target) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int closest = Integer.MAX_VALUE;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(Math.abs(target - sum) < Math.abs(target - closest)) {
                closest = sum;
            }

            if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return closest;
    }
    public static void main(String[] args) {

        int[] arr = {1,4,7,10};

        System.out.println(closestSum(arr, 15));
    }
}
