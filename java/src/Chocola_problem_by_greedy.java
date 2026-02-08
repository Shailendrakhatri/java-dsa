package src;
import java.util.*;
public class Chocola_problem_by_greedy {
    public static void main(String args[]){
        int n= 4;
        int m = 6;
        Integer costVar[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVar, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h =0 ;
        int v =0 ;
        int hp =1;
        int vp = 1;
        int cost = 0;

        while(h< costHor.length && v < costVar.length){
            //vertical cost is < horizontal cost
            if(costVar[v] <= costHor[h]){
                cost += (costHor[h] *vp);
                hp++;
                h++;
            }else{
                cost += (costVar[v] * hp);
                vp++;
                v++;
            }
        }
        while(h < costHor.length){
            cost += (costHor[h] *vp);
            hp++;
            h++;
        }
        while(v< costVar.length){
            cost += (costVar[v] * hp);
            vp++;
            v++;
        }
        System.out.println("minimum cost of cut is = " + cost);

    }
}
