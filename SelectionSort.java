public class SelectionSort {
    public static void sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i ;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j ;
                }
            }
            int temp = arr[smallest] ;
            arr[smallest] = arr[i];
            arr[i] = temp ;
        }
        print(arr);
    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] ={1,2,3,6,7,4,5,9};
        sort(a);
    }
}
