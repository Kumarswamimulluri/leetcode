class Solution {
    public String removeDuplicateLetters(String s) {
        int[]  freq = new int[26];
        boolean[] inStack = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(char ch : s.toCharArray()){
            freq[ch - 'a']--; // decreasing the freqency of curr char because we are currently using it

            if(inStack[ch - 'a']) continue; // if curr char is already in stack skip that char
            // oka vela stack empty kakunda mana curr ch stack lo vunna peek ch kante thakkuva ayyi inka
            // aa peek ch freq 0 kante ekkuva vunte dhanni pop chesi dhani inStack value false chestham
            while(!stack.isEmpty() && ch < stack.peek() && freq[stack.peek() - 'a'] > 0){
                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(ch); // if stack is empty we push the char
            inStack[ch - 'a'] = true; // and making that inStack value as  true (stack lo vundi)
        }
        StringBuilder res = new StringBuilder();
        // string builder ane res loki stack lo vunna characters ni append chestham
        for(char ch : stack) res.append(ch);

        return res.toString(); // res ni string loki convert chesi reurn chestham
    }
}