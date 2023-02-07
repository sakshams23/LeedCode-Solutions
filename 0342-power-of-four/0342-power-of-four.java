class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<16;i++){
            double p=Math.pow(4,i);
            int v = (int)Math.round(p);
            if(p==n){
                return true;
            }
        }
        return false;
       //return ( n>0 &&  1073741824%n==0 &&  n>=16); 
    }
}