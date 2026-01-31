import java.util.*;
public class Duplicate_Parentheses {
    public static boolean dupParentheses(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0 ; i<str.length(); i++){
            char ch  = str.charAt(i);
            //closing bracket
            if(ch == ')'){
                int count =0;
                while( s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count <1){
                    return true; // duplicate parentheses found
                }else {
                    s.pop(); //pop the opening bracket
                }
            }else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str = "((a+b))";
        String str1 = "(a+b)";
        System.out.println(dupParentheses(str1));
    }
}
