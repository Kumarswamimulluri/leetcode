class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for(int right = 0;right < nums.length;right++){
            sum += nums[right];

            while(sum >= target){
                minLen = Math.min(minLen,right - left + 1);
                int leftval = nums[left];
                sum -= leftval;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}