package src;
import java.util.*;
public class SubArray_Sum_Equal_to_K {
    public static void main(String args[]){
        int arr[] = {10, 2, -2, -20, 10};
        int K = -10;
        int sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize the map with sum 0 having one occurrence
        for(int j =0 ; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum-K)) {
                count += map.get(sum-K);
        }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println("Count of subarrays with sum equal to K is: " + count);

    }
}
