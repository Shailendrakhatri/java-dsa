package src;

import java.util.HashSet;

public class FirstDuplicate {
    public static void main(String[] args) {

        int arr[] = {2,1,3,5,3,2};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)){
                System.out.println("First duplicate: " + num);
                return;
            }
            set.add(num);
        }
    }
}
