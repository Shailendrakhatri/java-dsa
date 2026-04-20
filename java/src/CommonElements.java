package src;


import java.util.HashSet;

public class CommonElements {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,3,8};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            if(set.contains(num)){
                System.out.println("Common element found: " + num);
                return;
            }

        }
        System.out.println("No common element");
    }
}
