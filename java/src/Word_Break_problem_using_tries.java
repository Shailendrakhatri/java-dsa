package src;

public class Word_Break_problem_using_tries {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root  = new Node() ;
    public static void insert(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static  boolean search(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=0; i<key.length(); i++){
            String prefix = key.substring(0, i+1);
            String suffix = key.substring(i+1);
            if(search(prefix) && wordBreak(suffix)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String words[] = {"i", "like", "sam", "sung", "samsung", "mobile"};
        for(String word : words){
            insert(word);
        }
        String key = "ilikesamsung";
        String key2 = "ilikesamsungmobile";
        System.out.println(wordBreak(key2));
    }

}
