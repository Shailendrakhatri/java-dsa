package src;

public class Count_Distinct_Substrings {
    static class Node {
        Node[] child = new Node[26];
    }

    static int count = 0;

    static void insertSuffix(String s) {
        Node root = new Node();
        for (int i = 0; i < s.length(); i++) {
            Node curr = root;
            for (int j = i; j < s.length(); j++) {
                int idx = s.charAt(j) - 'a';
                if (curr.child[idx] == null) {
                    curr.child[idx] = new Node();
                    count++;
                }
                curr = curr.child[idx];
            }
        }
    }

    public static void main(String[] args) {
        String s = "ababa";
        insertSuffix(s);
        System.out.println(count + 1); // include empty substring
    }
}
