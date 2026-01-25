import java.util.*;

public class pair_Sum {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("Pair found: (" + list.get(i) + ", " + list.get(j) + ")");
                    return true;
                }
            }
        }
        return false;
    }

    // 2 pointer approach only works on sorted arraylist
    public static boolean one_pairSum(ArrayList<Integer> list, int target){

    int lp = 0;
    int rp = list.size() - 1;
    while(lp < rp){
        int currentSum = list.get(lp) + list.get(rp);
        if(currentSum ==target){
            return true;
        }
        if(currentSum < target ){
            lp++;
        }if(currentSum > target){
            rp--;
        }
    }
    return false;
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        int target = 8;
        System.out.println(one_pairSum(list, target));
    }
}
