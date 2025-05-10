class Solution {
    private void findcombinations(int ind,int target,int[]  arr,List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList(ds));
            return;
        }
        if(ind == arr.length) return;

        for(int i = ind;i<arr.length ; i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            ds.add(arr[i]);
            findcombinations(i+1,target - arr[i],arr,ans,ds);
            ds.remove(ds.size()-1);

        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        List<Integer> ds = new ArrayList<>();
        findcombinations(0,target,arr,ans,ds);
        return ans;
    }
}