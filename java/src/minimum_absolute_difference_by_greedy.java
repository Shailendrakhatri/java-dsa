package src;
import java.util.*;
public class minimum_absolute_difference_by_greedy {
    public static void main(String[] args){
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        // using arrayList
        ArrayList<Integer> total = new ArrayList<>();
        for(int i =0; i<A.length; i++){
            total.add(Math.abs(A[i]-B[i]));
        }
        for(int i=0; i<total.size(); i++){
            sum += total.get(i);
        }
        System.out.println("the minimum absolute  sum is = " + sum );
        // using simple  method (using exyra vairable to save minimum )
//        int absDiff = 0;
//        int  diff =0;
//        for(int i=0; i<A.length; i++){
//            diff = A[i] - B[i];
//            absDiff = Math.abs(diff);
//            sum += absDiff;
//        }
//        System.out.println("minimum absolute difference is = " + sum);
    }
}
