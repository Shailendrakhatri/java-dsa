package src;

public class Heap_Sort {

    public static void heapify(int arr[], int i, int size){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < size && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < size && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest != i){
            //swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest,size);
        }
    }
    public static void heapSort(int arr[]){
        // to build max heap
        int n= arr.length;
        for(int i = n/2; i>=0; i--){
            heapify(arr,i,n);
        }

        //step 2 push largest at end
        for(int i = n-1; i>0; i--){
            //swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,4,5,3};
        heapSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
