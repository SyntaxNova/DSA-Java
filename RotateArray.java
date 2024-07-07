class Solution {
    public static void rotate(int[] nums, int k) {
        int[] ar = nums.clone() ;
        // Iterating through k+1 to length
        for(int i = k+1 , m = 0 ; i<nums.length ; i++){
            ar[m++] = nums[i] ;
        }

        //Iterating through 0 to k+1
        for(int i = 0 , n = k ; i<k+1 ; i++){
            ar[n++] = nums[i] ;
        }

        // Copying ar array into nums
        for(int i = 0 ; i<nums.length ; i++){
            nums[i] = ar[i] ;
        }

        // Printiing array
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7};
        rotate(ar,3);
        int[] ar2 = {-1,-100,3,99};
        rotate(ar2, 2);
    }
}