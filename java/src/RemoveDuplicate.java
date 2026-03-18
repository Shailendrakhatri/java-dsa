package src;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        for (char c : set) {
            System.out.print(c);
        }
    }
}
