package src;

public class reverse_word_in_a_sentance {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
