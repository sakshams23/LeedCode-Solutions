import java.util.*;
//import java.util.Arrays;
class Solution {
    public boolean isMonotonic(int[] nums) {
    int n = nums.length;    
    int a[]= new int[n];
    int b[]= new int[n]; 
    for(int i=0; i<n; i++){
        a[i]=nums[i];
        b[i]=nums[i];
    }   
     Arrays.sort(a);
     Arrays.sort(b);
     reverse(b);
     
    return (Arrays.equals(nums, a) || Arrays.equals(nums, b) );
    }
    public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}