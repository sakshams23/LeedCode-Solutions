class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr = new ArrayList<>();
       for(int i=0;i<nums.length;i++){
           arr.add(index[i],nums[i]);
       } 
       int[] array = new int[nums.length];
       for(int i=0;i<nums.length;i++){
           array[i]=arr.get(i);
       }
        
       return array;
    }
}