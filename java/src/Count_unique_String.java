package src;
//cournt uniqye string by tries
public class Count_unique_String {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;
        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root ;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static int countUnique(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.freq == 1){
            count++;
        }
        for(int i =0 ; i<root.children.length; i++){
            if(root.children[i] != null ){
                count += countUnique(root.children[i]);
            }
        }
        return count;
    }
    public static void main(String args[]){
        String arr[] = {"apple", "zebra", "dog", "duck", "dove"};
        for(String word : arr){
            insert(word);
        }
        Node curr = root;
        root.freq = -1;
        System.out.println(countUnique(curr));
    }
}
