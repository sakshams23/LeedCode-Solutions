class Solution {
    
    public boolean digitCount(String num) {
      int n=num.length();
      int arr[] = new int[n];
      int c[] = new int[10];
      for(int i=0;i<n;i++){
          arr[i]= (int) num.charAt(i) - '0';
      }  
      for(int i=0;i<n;i++){
          c[arr[i]]++;
      } 
      int count=0;
      for(int i=0;i<n;i++){
          if(arr[i]==c[i]){
              count++;
          }
      } 
      
      
      return count==num.length();
    }
}