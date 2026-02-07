package src;
import java.util.*;

public class fractional_knapsack_problem {
    public static void main(String[] args){
        int weight[] = {10,20,30};
        int val[] = {60,100,120};
        int w =50;

        double ratio[][] = new double[val.length][2];
        //0th idx 1st for ration

        for(int i =0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] =val[i]/(double)weight[i];
        }

        //to sort
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal = 0;

        for(int i = ratio.length-1;i>=0;i-- ){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                //include fraction part
                finalVal +=(ratio[i][1] * capacity);
                capacity = 0;
                break;

            }
        }
        System.out.println("final value is = "+ finalVal);
    }
}

