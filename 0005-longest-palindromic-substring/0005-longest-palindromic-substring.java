class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";

        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                String sub = s.substring(i,j + 1);

                if(isPalindrome(sub) && sub.length() > res.length()){
                    res = sub;
                }
            }
        }
        return res;
    }
    private boolean isPalindrome(String s){
        int l = 0 ;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}