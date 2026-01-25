import java.util.ArrayList;

public class pair_sum_two {
    // 2 pointer approach only works on sorted and rotated arraylist
    public static boolean pairSumTwo(ArrayList<Integer> list , int target){
        int bp =  -1; // breaking point
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp + 1; // smallest
        int rp = bp; // largest

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % list.size();
            }
            else{
                rp = (rp - 1 + list.size()) % list.size();
            }

        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //sorted and rotated array
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(9);
        list.add(10);
        int target = 15;
        System.out.println(pairSumTwo(list, target));
    }
}
