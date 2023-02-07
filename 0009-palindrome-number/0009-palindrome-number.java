class Solution {
    public boolean isPalindrome(int x) {
      
String input = String.valueOf(x); 

    
        int n = input.length();

        if (n == 0)
            return true;

        return isPalRec(input, 0, n - 1);
    } 
    static boolean isPalRec(String input,
                            int s, int e)
    {

        if (s == e)
            return true;

        if (input.charAt(s) != input.charAt(e))
            return false;

        if (s < e + 1)
            return isPalRec(input, s + 1, e - 1);

        return true;
    }
    }
