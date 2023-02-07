class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l=new ArrayList<>();
        
        for(int i:nums)
        {
            for(char c:String.valueOf(i).toCharArray()){
                l.add(c-'0');
            }
        }
        int res[]=new int[l.size()];
        int k=0;
        for(int i:l){
            res[k++]=i;
        }
        return res;
    }
}