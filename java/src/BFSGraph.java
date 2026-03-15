package src;
import java.util.*;

public class BFSGraph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for(int i=0;i<4;i++) g.add(new ArrayList<>());

        g.get(0).add(1);
        g.get(0).add(2);
        g.get(1).add(3);
        g.get(2).add(3);

        boolean v[] = new boolean[4];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        v[0] = true;

        while(!q.isEmpty()){
            int n = q.poll();
            System.out.print(n+" ");
            for(int x : g.get(n))
                if(!v[x]){ v[x]=true; q.add(x); }
        }
    }
}
