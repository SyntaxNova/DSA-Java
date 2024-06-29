public class InsertionSort {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i<n ; i++){
            // current position in array i.e at index i = 1, because at 0 it is sorted part
            int current = arr[i];
            // j is the index of the previous index for comparison i.e if i = 1 then arr[i=1] is compared with arr[j=0]
            int j = i-1 ; 
            //while loop will run backwards and compares current element
            while (j>=0 && current < arr[j]) {
                // shifting all elements one place forward
                arr[j+1] = arr[j];
                //reducing index
                j--;
            }
            // insertion current element 
            arr[j+1] = current ;
        }
    }

    // helper function for printing sorted array
    static void printArray(int[] arr){
        sort(arr);
        for(int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1,4,3,8,9,0,2};

        InsertionSort.printArray(a);
    }
}
