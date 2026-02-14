package src;
import java.util.*;
import java.util.HashMap;

public class Hashmap_Basics {
    public static void main(String args[]){
        //create a hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        //insert values in hashmap
        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("US", 30);

        System.out.println(hm);

        // to get value of a key
        System.out.println(hm.get("India"));

        // to check if a key is not present
        System.out.println(hm.get("professor"));

        // Contains key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("professor"));

        //remove operation
//        hm.remove("US");
//        System.out.println(hm);
//        System.out.println(hm.remove("US"));

        //to get a size of hashmap
        System.out.println(hm.size());

        // is empty
        System.out.println(hm.isEmpty());

        //clear function
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm);
    }
}
