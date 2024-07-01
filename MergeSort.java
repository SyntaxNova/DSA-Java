public class MergeSort {
    static void Mergesort(int arr[] , int start , int mid , int end){
        int temp[] = new int[end - start + 1] ;

        int i = start , j = mid+1 , k = 0 ;

        while (i<=mid && j<=end) {
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while (j<= end) {
            temp[k++] = arr[j++];
        }

        for (i = start ; i<=end ; i++){
            arr[i] = temp[i-start];
        }
    }
    static void sort(int arr[] , int start , int end){
        if(start<end){
            int mid = (start+end) /2 ;
            sort(arr, start, mid);
            sort(arr, mid+1, end);
            Mergesort(arr, start, mid, end);
        }
    }
    static void PrintSortedArray(int arr[]){
        sort(arr, 0, arr.length-1);
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int ar[] = {3,2,9,4,6};

        PrintSortedArray(ar);
    }
}
