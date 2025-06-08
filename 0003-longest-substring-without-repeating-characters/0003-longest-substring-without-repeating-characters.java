class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max_len = 0;

        while(right < s.length()){
            char curr = s.charAt(right);
            if(!set.contains(curr)){
                set.add(curr);
                max_len = Math.max(max_len,right - left + 1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max_len;
    }
}