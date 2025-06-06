class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();

        for(String word : words){
            StringBuilder reversedword =  new StringBuilder(word);

            res.append(reversedword.reverse().toString()).append(" ");
        }
        return res.toString().trim();
    }
}