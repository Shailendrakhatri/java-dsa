import java.util.LinkedList;
public class LinkedList_collection {


    public static void main(String[]  args ){
        LinkedList<Integer> ll  = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);
        System.out.println(ll);
        // REMOVE
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
    }
}
