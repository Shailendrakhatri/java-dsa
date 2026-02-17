package src;
import java.util.*;


public class Find_Itinerary_for_Tickets {
    public static String getStarted(HashMap<String, String> tickets) {
        HashMap<String, String> reverseMap = new HashMap<>();
        for(String key : tickets.keySet()){
            reverseMap.put(tickets.get(key), key);
        }
        for(String key : tickets.keySet()){
            if(!reverseMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");


        String start = getStarted(tickets);
        System.out.print("Start from " + start);
        for(String key : tickets.keySet()){
            System.out.print( "--> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();


    }

}
