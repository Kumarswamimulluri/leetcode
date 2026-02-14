class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for(int i = 0;i < n;i++){
            count += expand(s,i,i); //odd
            count += expand(s,i,i+1); //even
        }
        return count;

    }
    private int expand(String s,int left, int right){
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
        }
        return count;
    }
}
// Brute Force

// int n = s.length();
//         int count = 0;

//         for(int i = 0;i < n;i++){
//             for(int j = i;j < n;j++){
//                 if(isPalindrome(s,i,j)){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     private boolean isPalindrome(String s,int l, int r){
//         while(l < r){
//             if(s.charAt(l) != s.charAt(r)){
//                 return false;
//             }
//             l++;
//             r--;
//         }
//         return true;
//     }