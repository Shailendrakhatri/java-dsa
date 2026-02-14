package src;
import java.util.*;
public class Linked_hashmap {
        public static void main(String args[]){
            LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

            lhm.put("India", 120);
            lhm.put("China", 150);
            lhm.put("US", 30);

            System.out.println(lhm);

            // tree map
                TreeMap<String, Integer> tm = new TreeMap<>();
                tm.put("India", 120);
                tm.put("China", 150);
                tm.put("US", 30);

            System.out.println(tm);

        }
}
