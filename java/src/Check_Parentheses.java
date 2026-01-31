import java.util.*;
public class Check_Parentheses {


    public static boolean isvalid(char ch[]) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            //opening brackets
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {    //closing brackets
                if (s.isEmpty()) {
                    return false;
                }
                if((s.peek() == '(' && c == ')') ||
                        (s.peek() == '{' && c== '}') ||
                        (s.peek() == '[' && c== ']')){
                    s.pop();
            }
            else{
                return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "(){}[]()({}{}[[][]{}{}]()()()({}{}[][]){}{})";
        char ch[] = str.toCharArray();
        System.out.println(isvalid(ch));
    }

}
