class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        Map<Character,Integer> tfreq = new HashMap<>();
        for(char ch : t.toCharArray()){
            tfreq.put(ch,tfreq.getOrDefault(ch,0) + 1);
        }

        Map<Character,Integer> window = new HashMap<>();
        int have = 0 , need = tfreq.size();
        int minLen = Integer.MAX_VALUE;
        int startInd = 0;
        int left = 0;

        for(int right = 0; right < s.length();right++){
            char curr = s.charAt(right);
            window.put(curr,window.getOrDefault(curr,0) + 1);

            if(tfreq.containsKey(curr) && window.get(curr).intValue() == tfreq.get(curr).intValue()){
                have++;
            }

            while(have == need){
                if((right - left + 1) < minLen){
                    minLen = right - left + 1;
                    startInd = left;
                }

                char leftchar = s.charAt(left);
                window.put(leftchar,window.get(leftchar) - 1);

                if(tfreq.containsKey(leftchar) && window.get(leftchar) < tfreq.get(leftchar)){
                    have--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startInd,startInd + minLen); 
    }
}