package src;
import java.util.*;

public class Union_and_InterSection {
    // union and intersection using hashset
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};
        HashSet<Integer> set = new HashSet<>();

        //for union
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Union of two arrays is " + set.size());
        for(Integer i : set){
            System.out.print(i + " ");
        }
        System.out.println();


        // intersection
        set.clear();
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection of two arrays is " + count);
        for(Integer i : set){
            System.out.print(i + " ");
        }

    }
}
