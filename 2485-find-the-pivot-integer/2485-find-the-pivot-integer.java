class Solution {
    public int pivotInteger(int n) {
        int fsum=1,bsum=(n*(n+1))/2;
        
        if(n==1) return 1;
        for(int i=2;i<=n;i++)
        {
            fsum=fsum+i;
            bsum=bsum-(i-1);
            if(fsum==bsum)
            return i;
        }
        return -1;
    }
}