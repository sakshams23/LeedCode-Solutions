class Solution {
    public void reverseString(char[] s) {
      helper(s);
    }
    private void helper(char[] s){
        int n = s.length;
        char arr[] = new char[n];
        for(int i=0;i<s.length;i++){
            arr[i]=s[(s.length-1)-i];
        }
        for(int i=0;i<s.length;i++){
            s[i]=arr[i];
        }
    }
}