class Solution {
    public String clearStars(String s) {
        int n = s.length();
        boolean[] toRemove = new boolean[n];
        List<Integer>[] bucket = new List[26];

        for(int i = 0;i < 26;i++){
            bucket[i] = new ArrayList<>();
        }

        for(int i = 0;i < n;i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                toRemove[i] = true;
                for(int j = 0;j < 26;j++){
                    if(!bucket[j].isEmpty()){
                        int ind = bucket[j].remove(bucket[j].size() - 1);
                        toRemove[ind] = true;
                        break;
                    }
                }
            }
            else{
                bucket[ch - 'a'].add(i);
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < n;i++){
            if(!toRemove[i]){
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}