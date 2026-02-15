package src;
import java.util.*;
public class Largest_SubArray_With_Sum_0 {
    public static void main(String args[]){
            int arr[] = {15,-2,2,-8,1,7,10,23};
            int sum = 0, maxLength = 0;

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int j =0 ; j<arr.length; j++){
                sum += arr[j];
                if(map.containsKey(sum)) {
                    maxLength = Math.max(maxLength, j - map.get(sum));
                }else{
                    map.put(sum, j);
                }

            }
            System.out.println("Length of the largest subarray with sum 0 is: " + maxLength);
    }
}
