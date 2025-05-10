class Solution {
    private void findCombinations(int ind, int target, int[] arr, List<List<Integer>> ans,List<Integer> ds){
        if(target == 0){
            ans.add( new ArrayList <>(ds));
            return;
        }
        if(ind == arr.length) return;

        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombinations(ind,target - arr[ind],arr,ans,ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind+1,target,arr,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombinations(0,target,arr,ans,ds);
        return ans;
    }
}