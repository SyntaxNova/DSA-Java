// Java basics Revision of Basic syntax and operators and data types

/**
 *  Find out smallest and largest number in a given Array?
 */
public class Quick{

    public static void main(String[] args) {
        int[] ar = new int[5];
        ar = new int[]{1,2,3,4};
        int smallest = ar[0];
        int largest = ar[0];
        for(int i = 0 ; i<ar.length ; i++){
            if (ar[i] < smallest) {
                smallest = ar[i];
                
            }
            else if(ar[i] > largest){
                largest = ar[i];
            }
        }
        System.out.println("largest number = " + largest);
        System.out.println("smallest number = "+ smallest);
    }
}