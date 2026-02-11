class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closest_sum  = nums[0] + nums[1] + nums[2];
        for(int i = 0;i < n;i++){
            for(int j = i+1; j < n;j++){
                for(int k = j+1;k < n;k++){
                    int curr = nums[i] + nums[j] + nums[k];
                    if(Math.abs(curr - target) < Math.abs(closest_sum - target)){
                        closest_sum = curr;
                    }
                }
            }
        }
        return closest_sum;
    }
}