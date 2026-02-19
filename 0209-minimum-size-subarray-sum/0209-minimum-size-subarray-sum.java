class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for(int right = 0;right < n;right++){
            sum += nums[right];

            while(sum >= target){
                minLen = Math.min(minLen,right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
// Brute Force
// for(int i = 0;i < n;i++){
//             int sum = 0;
//             for(int j = i;j < n;j++){
//                 sum += nums[j];

//                 if(sum >= target){
//                     minLen = Math.min(minLen,j - i + 1);
//                     break;
//                 }
//             }
//         }