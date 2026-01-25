import java.util.*;
public class Two_D_Arraylist {

    public static void main(String [] args){
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        MainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        MainList.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(6);
        MainList.add(list3);

        System.out.println(MainList);

        for(int i =0 ; i<MainList.size(); i++){
            ArrayList<Integer> currList = MainList.get(i);
            for(int j =0 ; j< currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
