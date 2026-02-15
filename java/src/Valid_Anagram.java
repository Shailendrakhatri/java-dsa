package src;
import java.util.*;

// using hash map
public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0 ; i< s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        // decrementing the count of each character in t from the map
        for(int i=0; i< t.length(); i++){
            char c = t.charAt(i);
            // if the character is present in the map, decrement its count
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }else{
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        String s = "gramana";
        String t = "profedd";

        System.out.println(isAnagram(s, t));
    }
}
