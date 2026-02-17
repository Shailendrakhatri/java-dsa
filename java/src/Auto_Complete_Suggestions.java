package src;
import java.util.*;
public class Auto_Complete_Suggestions {

    static class Node {
        Node[] children = new Node[26];
        boolean isEnd;
    }

    Node root = new Node();

    public void insert(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (curr.children[idx] == null)
                curr.children[idx] = new Node();
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }

    public List<String> getSuggestions(String prefix) {
        List<String> result = new ArrayList<>();
        Node node = searchPrefix(prefix);
        if (node != null) {
            dfs(node, prefix, result);
        }
        return result;
    }

    private Node searchPrefix(String prefix) {
        Node curr = root;
        for (char ch : prefix.toCharArray()) {
            int idx = ch - 'a';
            if (curr.children[idx] == null)
                return null;
            curr = curr.children[idx];
        }
        return curr;
    }

    private void dfs(Node node, String word, List<String> result) {
        if (node.isEnd)
            result.add(word);

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                dfs(node.children[i], word + (char) (i + 'a'), result);
            }
        }
    }
}



