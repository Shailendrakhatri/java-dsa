public class permutations_by_backtracking {
    public static void permutations(String str , String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
        }
        //recursion O(n*n)!
        for(int i=0; i< str.length( ); i++){
            char ch = str.charAt(i);
           String  Newstr = str.substring(0,i) + str.substring(i+1);
            permutations(Newstr , ans+ch);
        }

    }
    public static void main (String args[]){
        String str = "professor";

        permutations(str , "");
    }
}
