package src;
import java.util.*;
public class HashSet_Basics {

    public static void main(String args[]){

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Delhi"); // duplicate entry will not be added
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Indore");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //by advanced for loop
        for(String city : cities) {
            System.out.println(city);
        }

    }
}
