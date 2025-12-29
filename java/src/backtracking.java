public class backtracking {
//put the number in array then -2 from each element
public static void changedArr(int arr[], int i, int val){
//base case
    if(i == arr.length) {
       printArr(arr);
       return;
    }
//recursion
    arr[i] =val;
    changedArr(arr,i+1,val+1);
    arr[i] = arr[i]-2;
}

public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
}
    public static void main(String args[]){
    int arr[] =new int[5];
    changedArr(arr,0,1);
    printArr(arr);
    }


}
