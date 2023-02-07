class Solution {
    public boolean isPowerOfTwo(int n) {
      for(int i=0;i<32;i++){
            double p=Math.pow(2,i);
            int v = (int)Math.round(p);
            if(p==n){
                return true;
            }
        }
        return false;  
    }
}