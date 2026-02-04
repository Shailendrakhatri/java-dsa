public class search_in_Linked_list {
    public static class Node {
        int data ;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add node at first
    public void addFirst(int data){
        //create now node
        search_in_Linked_list.Node newNode = new search_in_Linked_list.Node(data);
        size++;
        if(head ==null){
            head = tail = newNode;
            return;
        }
        //newnode next = head;
        newNode.next = head; //link
        //head == newNode;
        head = newNode;
    }
    public void addLast(int data){
        //create an node
        search_in_Linked_list.Node newNode = new search_in_Linked_list.Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void add(int idx , int data){
        if (idx ==0){
            addFirst(data);
            return;
        }
        //create a new node
        search_in_Linked_list.Node newNode = new search_in_Linked_list.Node(data);
        size++;
        search_in_Linked_list.Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }
    // remove node
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val =head.data;
        head = head.next;
        size--;
        return val;
    }
    //remove last
    public int removeLast(){
        if(size == 0 ){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if (size ==1 ){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        //find second last
        search_in_Linked_list.Node prev = head;
        for(int i = 0; i<size -2 ; i++){
            prev = prev.next;
        }
        int val = prev.next.data;//tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node  temp = head;
        int i = 0;
        while (temp != null){
            if(temp.data ==key) {
                return i; // key found at index i
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    public int helper( Node head , int key){
        //base case

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public int recSearch (int key){
        return helper(head, key);
    }

    //to reverse linked list
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n){
        //calculate size;
        int size = 0;
        Node temp  = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        //if delete first
        if(n == size){
            head = head.next;
            return;
        }
        //size - n
        int i =1;
        int iToFind = size - n;
        Node prev = head;
        while(i< iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }


    public Node findMid(Node head){
       Node slow = head;
       Node fast = head;
       while (fast != null && fast.next != null){
           slow =  slow.next;
           fast = fast.next.next;
       }
       return slow;
    }
    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        // find mid
            Node midNode = findMid(head);

            //reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while (curr != null){
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
            }
            Node right = prev; //right half head
            Node left = head;
            //check left half and right half
            while (right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }


        return true;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;//cycle exists
            }
        }
        return false; //no cycle found
    }

    public static void removeCycle(){
        //detect cycle
        Node slow =head;
        Node fast =head;
        boolean cycle = false;
        while (fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if (cycle == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while (slow!= fast){
            prev = fast; //last node
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle
        prev.next = null;
    }
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//mid node
    }
    public Node merge(Node head1 , Node head2){
        Node meregedLL = new Node(-1);
        Node temp = meregedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        //leftover nodes
        while (head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return meregedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getMid(head);
    // left and right ms
        Node rightHead = mid.next;
        mid.next = null ;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
    //return merged list
        return merge(newLeft, newRight);

    }

    //to make zigzah pattern linked list
    public void zigZag() {
        // find mid
        Node mid = getMid(head);
        //rverse 2nd half

        //merge 2 half in zigzag manner
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        //zigzag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }
    // to print linked list
    public void printLL( Node head){
    if(head == null){
        System.out.println("ll is empty");
        return ;
    }
    Node temp = head;
    while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
//        search_in_Linked_list ll = new search_in_Linked_list();
////        ll.addFirst(1);
////        ll.addFirst(2);
//        ll.addFirst(3);
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(2);
//        ll.addLast(1);
//        ll.addLast(3);
//        ll.add(2, 9);
//        //print linkedlist
//        ll.printLL(head);
//        System.out.println(ll.size);
//        ll.removeFirst();
//        ll.printLL(head);
//        System.out.println(ll.size);
//        ll.removeLast();
//        ll.printLL(head);
//        System.out.println(ll.size);
////        System.out.println(ll.itrSearch(1));
////
////        System.out.println(ll.recSearch(4));
//
//        ll.printLL(head);
//        ll.reverse();
//        ll.printLL(head);
//        ll.deleteNthFromEnd(2);
//        ll.printLL(head);
//        ll.printLL(head);
//        head = new Node(1);
//        Node temp = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
////        head.next.next.next = head;
//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());
//

//        System.out.println(ll.checkPalindrome());
        search_in_Linked_list ll = new search_in_Linked_list();
        ll.addLast(5);
        ll.addLast(3);
        ll.addLast(8);
//        ll.addLast(1);
        ll.addLast(4);
        System.out.println("Original Linked List:");
        ll.printLL(head);
        head = ll.mergeSort(head);
        System.out.println("Sorted Linked List:");
        ll.printLL(head);
        //zigzag
        ll.zigZag();
        System.out.println("ZigZag Linked List:");
        ll.printLL(head);
    }
}
