class Solution {
    public int bitwiseComplement(int n) {
    //    String b = Integer.toBinaryString(n); 
    //    String d = b>>1;
    //     int x = Integer.parseInt(d, 2);
     int bits = Integer.toBinaryString(n).length();
    int maxBound = (int)( Math.pow(2, bits)-1);
       return n ^ maxBound;
    }
}