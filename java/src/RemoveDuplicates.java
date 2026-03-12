package src;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = {1,2,3,2,4,1,5};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        System.out.println("Unique elements: " + set);
    }
}
