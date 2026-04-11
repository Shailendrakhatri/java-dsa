package src;
import java.util.Arrays;

public class ValidTriangles {
    public static int countTriangles(int[] arr) {
        Arrays.sort(arr);

        int count = 0;
        for(int i = arr.length - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while(left < right) {
                if(arr[left] + arr[right] > arr[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {4,6,3,7};

        System.out.println(countTriangles(arr));
    }
}
