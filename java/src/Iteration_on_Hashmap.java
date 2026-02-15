package src;
import java.util.*;
public class Iteration_on_Hashmap {
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("US", 30);
        hm.put("Russia", 20);
        hm.put("Japan", 10);
        hm.put("Nepal", 5);

        // to irerate on hashmap we can use keySet() function which will return a set of keys in the hashmap

        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String k :  keys){
            // to get the value with their respective keys
            System.out.println("Key: "+k+" Value: "+hm.get(k));
        }

    }
}

