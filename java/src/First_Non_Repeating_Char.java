import java.util.*;
public class First_Non_Repeating_Char {
    public static void PrintNonRepeating(String str){
        int freq[] = new int[26]; //'a'-'b'
        java.util.Queue<Character> q = new java.util.LinkedList<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']  > 1){
                q.remove();
            }
            if(q.isEmpty()) {
                System.out.print(-1+" ");
            }else {
                System.out.print(q.peek()+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str = "aabccxb";
        PrintNonRepeating(str);
    }
}
