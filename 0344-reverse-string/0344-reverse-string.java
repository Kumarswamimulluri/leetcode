class Solution {
    public void reverseString(char[] s) {
        char[] temp = new char[s.length];

        for(int i = 0;i < s.length;i++){
            temp[i] = s[s.length - 1 - i];
        }

        for(int i = 0;i < s.length;i++){
            s[i] = temp[i];
        }

    }
}