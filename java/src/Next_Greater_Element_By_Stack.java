import java.util.*;
public class Next_Greater_Element_By_Stack {


    public static void main(String args[]){

        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        Stack<Integer>  s= new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            //while stack is not empty and top of stack is less than or equal to arr[i]
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //if stack is empty, then no greater element on right
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            //to push current index
            s.push(i);
        }
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
