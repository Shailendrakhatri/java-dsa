package src;
import java.util.*;
public class Linked_hashSet {

    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Mumbai");



        System.out.println(cities);


        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Chennai");
        lhs.add("Delhi");
        lhs.add("Bangalore");
        lhs.add("Mumbai");
        System.out.println(lhs);
        // treeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Chennai");
        ts.add("Delhi");
        ts.add("Bangalore");
        ts.add("Mumbai");
        ts.add("Agra");
        ts.add("Indore");
        System.out.println(ts);






    }
}
