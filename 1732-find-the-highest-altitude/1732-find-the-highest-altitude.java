class Solution {
    public int largestAltitude(int[] gain) {;
        int n = gain.length;
       int pf[] = new int[n+1];
       pf[0]=0;
      // pf[1]=gain[0];
       for(int i=1;i<n+1;i++){
           pf[i]=pf[i-1]+gain[i-1];
       }
       Arrays.sort(pf);
       return pf[n];
    }
}