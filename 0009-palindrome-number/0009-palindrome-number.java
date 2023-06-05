class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        boolean palin = false;
        int end = y.length() - 1;

        for(int start = 0; start <= end; start++){
            if(y.charAt(start) == y.charAt(end)){
                palin = true;
                end--;
            }
            else{
                palin = false;
                break;
            }
        }

        return palin;

        
         
    }
}