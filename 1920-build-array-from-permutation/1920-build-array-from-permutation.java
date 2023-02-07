class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int nums2[] = new int[n];
        for(int i=0;i<n;i++){
            nums2[i]= nums[nums[i]];
        }
        return nums2;
    }
}