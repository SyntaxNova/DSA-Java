public class BubbleSort {
    public static void sort(int arr[]){
        int n = arr.length ;
        for (int i = 0; i < n-1; i++) { 
            for (int j = 0; j < n-i-1 ; j++) {
                if (arr[j]>arr[j+1]) {
                    //swaping 
                    int temp = arr[j];
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
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
