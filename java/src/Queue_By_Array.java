public class Queue_By_Array {
    public class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue (int n ){
            arr = new int[n];
            size = n;
            rear = -1;
            front =  -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //add function
//        public static void add(int data){
//            if(rear == size-1){
//                System.out.println("queue is full");
//                return;
//            }
//            rear = rear+1;
//            arr[rear] = data;
//        }
        //for circular list
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(front == -1){
                front =0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        // to remove
//        public static int remove(){
//            if(isEmpty()){
//                System.out.println("queue is empty");
//                return -1;
//            }
//                int front  = arr[0];
//                //shift the  element
//                for(int i = 0 ; i< rear; i++){
//                    arr[i] = arr[i+1];
//                }
//                rear = rear-1;
//                return front;
//            }
        // for circular list
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            int result = arr[front];

            //last element remove
            if (front == rear) {
            rear = front -1;
        }else {
                front = (front + 1) % size;
            }
                return result;
        }
        //peek ;
        public static int peek(){
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }else{
                //return arr[0];
                //for circular
                return arr[front];
            }
        }

    }
    public static void main(String[] args) {
            Queue_By_Array q = new Queue_By_Array();
            Queue_By_Array.Queue queue = q.new Queue(5);
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
        System.out.println(queue.remove());
        queue.add(6);
        System.out.println(queue.remove());
        queue.add(7);
        System.out.println(queue.remove());
        queue.add(8);
            while(!queue.isEmpty()){
                System.out.println(queue.peek());
                queue.remove();
            }
    }
}
